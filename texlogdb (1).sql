-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 11 Ιουν 2021 στις 17:16:43
-- Έκδοση διακομιστή: 10.4.13-MariaDB
-- Έκδοση PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `texlogdb`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `companies`
--

CREATE TABLE `companies` (
  `email` varchar(30) NOT NULL,
  `code` varchar(10) NOT NULL,
  `name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Άδειασμα δεδομένων του πίνακα `companies`
--

INSERT INTO `companies` (`email`, `code`, `name`) VALUES
('joh@hot.gr', '1', 'ΑΕ ΟΛΑ ΚΑΛΑ'),
('john@yah.com', '4hBbtuSot4', 'ΑΕ ΟΙ ΚΑΛΟΙ');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `employees`
--

CREATE TABLE `employees` (
  `name` varchar(20) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `specialty` varchar(20) NOT NULL,
  `age` int(2) NOT NULL,
  `cv` text NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Άδειασμα δεδομένων του πίνακα `employees`
--

INSERT INTO `employees` (`name`, `lastname`, `specialty`, `age`, `cv`, `password`) VALUES
('Βαρβάρα', ' Βυθούλκα', 'Γραμματεία', 22, '2017-2022 φοιτήτρια', '1234'),
('Γιάνης', 'Διαμαντόπουλος', 'Σερβιτόρος', 22, '2017-2022 φοιτητής', '1234'),
('Γιάννης', 'Παπαγιαννόπουλος', 'Σερβιτόρος', 23, '2017-2022 φοιτητής', 'hy2y6bhiKH'),
('Διονύσης', 'Καταβάτης', 'Υποδοχή', 25, 'φοιτητής,προπονητής τέννις', '85acYC8sl5');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `orders`
--

CREATE TABLE `orders` (
  `ID` int(8) NOT NULL,
  `FNAME` varchar(20) NOT NULL,
  `LNAME` varchar(25) NOT NULL,
  `PHONE` int(10) NOT NULL,
  `ORDER` varchar(30) NOT NULL,
  `TOTAL_AMOUNT` int(6) NOT NULL,
  `ORDER_CREATOR` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `productorders`
--

CREATE TABLE `productorders` (
  `product` varchar(30) NOT NULL,
  `stocks` int(6) NOT NULL,
  `comments` text NOT NULL,
  `company` varchar(30) NOT NULL,
  `situation` enum('Παραδόθηκε','Εκκρεμεί','Ματαιώθηκε') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Άδειασμα δεδομένων του πίνακα `productorders`
--

INSERT INTO `productorders` (`product`, `stocks`, `comments`, `company`, `situation`) VALUES
(' Σαπούνια', 3, 'Αυτά στείλε', 'john@yah.com', 'Εκκρεμεί'),
(' Χαρτί κουζίνας', 8, 'Αυτάααα', 'joh@hot.gr', 'Εκκρεμεί'),
(' Χαρτί υγείας', 14, 'Κι αυτάαα', 'joh@hot.gr', 'Εκκρεμεί'),
(' Χαρτοπετσέτες', 6, 'Και αυτάααα', 'joh@hot.gr', 'Εκκρεμεί');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `reservation`
--

CREATE TABLE `reservation` (
  `ID` int(8) NOT NULL,
  `FNAME` varchar(20) NOT NULL,
  `LNAME` varchar(25) NOT NULL,
  `PHONE` int(11) NOT NULL,
  `DURATION` int(3) NOT NULL,
  `GUESTS` int(2) NOT NULL,
  `RES_CREATOR` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `stocks`
--

CREATE TABLE `stocks` (
  `company` varchar(30) NOT NULL,
  `product` varchar(30) NOT NULL,
  `stocks` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Άδειασμα δεδομένων του πίνακα `stocks`
--

INSERT INTO `stocks` (`company`, `product`, `stocks`) VALUES
('john@yah.com', ' Μαλακτικό', 49),
('john@yah.com', ' Σαμπουάν', 53),
('john@yah.com', ' Σαπούνια', 42),
('joh@hot.gr', ' Χαρτί κουζίνας', 10),
('joh@hot.gr', ' Χαρτί υγείας', 19),
('joh@hot.gr', ' Χαρτοπετσέτες', 90);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `users`
--

CREATE TABLE `users` (
  `name` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `job` enum('hotelier','employee') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Άδειασμα δεδομένων του πίνακα `users`
--

INSERT INTO `users` (`name`, `password`, `job`) VALUES
('john', '1234', 'hotelier'),
('Βαρβάρα', '2', 'employee'),
('Γιάνης', '1', 'employee'),
('Γιάννης', 'hy2y6bhiKH', 'employee'),
('Διονύσης', '85acYC8sl5', 'employee');

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `companies`
--
ALTER TABLE `companies`
  ADD PRIMARY KEY (`email`);

--
-- Ευρετήρια για πίνακα `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`name`);

--
-- Ευρετήρια για πίνακα `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ordercreator` (`FNAME`);

--
-- Ευρετήρια για πίνακα `productorders`
--
ALTER TABLE `productorders`
  ADD PRIMARY KEY (`product`);

--
-- Ευρετήρια για πίνακα `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `rescreator` (`RES_CREATOR`);

--
-- Ευρετήρια για πίνακα `stocks`
--
ALTER TABLE `stocks`
  ADD PRIMARY KEY (`product`);

--
-- Ευρετήρια για πίνακα `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`name`);

--
-- Περιορισμοί για άχρηστους πίνακες
--

--
-- Περιορισμοί για πίνακα `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `empname` FOREIGN KEY (`name`) REFERENCES `users` (`name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `ordercreator` FOREIGN KEY (`FNAME`) REFERENCES `employees` (`name`);

--
-- Περιορισμοί για πίνακα `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `rescreator` FOREIGN KEY (`RES_CREATOR`) REFERENCES `employees` (`name`);

--
-- Περιορισμοί για πίνακα `stocks`
--
ALTER TABLE `stocks`
  ADD CONSTRAINT `companyname` FOREIGN KEY (`company`) REFERENCES `companies` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
