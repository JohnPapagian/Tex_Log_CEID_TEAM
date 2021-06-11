-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 03 Ιουν 2021 στις 10:08:52
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
('joh@hot.gr', '3VtsYumdFF', 'ΑΕ ΟΛΑ ΚΑΛΑ'),
('john@yah.com', '4hBbtuSot4', 'ΑΕ ΟΙ ΚΑΛΟΙ');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `stocks`
--

CREATE TABLE `stocks` (
  `company` varchar(30) NOT NULL,
  `product` varchar(30) NOT NULL,
  `stocks` int(6) DEFAULT NULL
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
('john', '1234', 'hotelier');

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `companies`
--
ALTER TABLE `companies`
  ADD PRIMARY KEY (`email`);

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
-- Περιορισμοί για πίνακα `stocks`
--
ALTER TABLE `stocks`
  ADD CONSTRAINT `companyname` FOREIGN KEY (`company`) REFERENCES `companies` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
