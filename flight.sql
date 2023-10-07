-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 May 2023, 04:13:21
-- Sunucu sürümü: 10.4.27-MariaDB
-- PHP Sürümü: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `flightdatabase`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `flight`
--

CREATE TABLE `flight` (
  `FlightNumber` int(11) NOT NULL,
  `FirmName` text NOT NULL,
  `DeparturePlace` text NOT NULL,
  `DepartureAirport` text NOT NULL,
  `ArrivalPlace` text NOT NULL,
  `ArrivalAirport` text NOT NULL,
  `DepartureDate` date NOT NULL,
  `DepartureTime` time NOT NULL,
  `ArrivalDate` date NOT NULL,
  `ArrivalTime` time NOT NULL,
  `Price` float NOT NULL,
  `ConnectingFlight` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `flight`
--

INSERT INTO `flight` (`FlightNumber`, `FirmName`, `DeparturePlace`, `DepartureAirport`, `ArrivalPlace`, `ArrivalAirport`, `DepartureDate`, `DepartureTime`, `ArrivalDate`, `ArrivalTime`, `Price`, `ConnectingFlight`) VALUES
(115, 'Pegasus', 'Ankara', 'ESB', 'İstanbul', 'ISL', '2023-05-20', '14:30:00', '2023-05-20', '15:15:00', 850, 'No'),
(116, 'Turkish Airlines', 'İstanbul', 'IST', 'London', 'LHR', '2023-05-17', '10:00:00', '2023-05-17', '12:05:00', 3384, 'No'),
(117, 'Wizz Air', 'Ankara', 'ESB', 'Budapest', 'BUD', '2023-05-17', '01:07:00', '2023-05-17', '16:50:00', 5969, 'Yes'),
(118, 'Norse Atlantic Airways', 'London', 'LGW', 'New York', 'JFK', '2023-05-18', '12:40:00', '2023-05-18', '15:50:00', 16848, 'No'),
(119, 'American Airlines', 'New York', 'LGA', 'Washington D.C', 'DCA', '2023-05-17', '08:20:00', '2023-05-17', '09:45:00', 3275, 'No'),
(120, 'Qatar Airways', 'Istanbul', 'IST', 'Doha', 'DIA', '2023-05-18', '23:00:00', '2023-05-19', '03:10:00', 14500, 'No'),
(121, 'Turkish Airlines', 'Ankara', 'ESB', 'Istanbul', 'ISL', '2023-05-18', '15:00:00', '2023-05-18', '15:45:00', 1000, 'No'),
(122, 'Delta Airlines', 'New York', 'JFK', 'Montreal', 'YUL', '2023-05-19', '20:35:00', '2023-05-19', '22:35:00', 5029, 'No'),
(123, 'Air France', 'Singapore', 'SIN', 'Paris', 'CDG', '2023-05-20', '10:40:00', '2023-05-20', '18:10:00', 23332, 'No'),
(124, 'Air Canada', 'Los Angeles', 'LAX', 'Madrid', 'MAD', '2023-05-20', '12:20:00', '2023-05-21', '11:00:00', 44433, 'Yes'),
(125, 'LATAM Airlines', 'Rio de Janeiro', 'GIG', 'Rome', 'FCO', '2023-05-19', '14:50:00', '2023-05-20', '09:50:00', 31336, 'Yes'),
(126, 'British Airways', 'Amsterdam', 'AMS', 'Washington D.C', 'DCA', '2023-05-18', '10:55:00', '2023-05-18', '19:13:00', 17065, 'Yes');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`FlightNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
