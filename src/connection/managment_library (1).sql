-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 06 sep. 2023 à 10:49
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `managment_library`
--

-- --------------------------------------------------------

--
-- Structure de la table `adherent`
--

CREATE TABLE `adherent` (
  `id` int(11) NOT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `adherent`
--

INSERT INTO `adherent` (`id`, `nom`, `numero`) VALUES
(1, 'anas', 678797767);

-- --------------------------------------------------------

--
-- Structure de la table `author`
--

CREATE TABLE `author` (
  `id` int(11) NOT NULL,
  `nom` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `author`
--

INSERT INTO `author` (`id`, `nom`) VALUES
(1, 'youssef');

-- --------------------------------------------------------

--
-- Structure de la table `livre`
--

CREATE TABLE `livre` (
  `isbn` int(11) NOT NULL,
  `titre` varchar(100) DEFAULT NULL,
  `quantiteTotal` int(11) DEFAULT NULL,
  `quantitePerdu` int(11) DEFAULT NULL,
  `authorId` int(11) DEFAULT NULL,
  `softDelete` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `livre`
--

INSERT INTO `livre` (`isbn`, `titre`, `quantiteTotal`, `quantitePerdu`, `authorId`, `softDelete`) VALUES
(1234, 'the peerless', 10, 1, 1, 0),
(4568, 'HHHHH', 88, 0, 1, 0),
(45678, 'HHHHH', 88, 0, 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `dateDemprunt` date DEFAULT NULL,
  `datePrevueDeRetoure` date DEFAULT NULL,
  `dateDeRetoure` date DEFAULT NULL,
  `adherentID` int(11) DEFAULT NULL,
  `livreID` int(11) DEFAULT NULL,
  `statusLivre` enum('Disponible','Emprunté','perdu') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`id`, `dateDemprunt`, `datePrevueDeRetoure`, `dateDeRetoure`, `adherentID`, `livreID`, `statusLivre`) VALUES
(2, '2023-09-13', '2023-09-04', NULL, 1, 1234, 'Disponible');

--
-- Déclencheurs `reservation`
--
DELIMITER $$
CREATE TRIGGER `addPerdus` AFTER UPDATE ON `reservation` FOR EACH ROW BEGIN
    IF NEW.statusLivre = "perdu" THEN
        UPDATE livre SET quantitePerdu = quantitePerdu + 1
        WHERE livre.isbn = NEW.livreID;
    END IF;
END
$$
DELIMITER ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `adherent`
--
ALTER TABLE `adherent`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `livre`
--
ALTER TABLE `livre`
  ADD PRIMARY KEY (`isbn`),
  ADD KEY `FK_livre` (`authorId`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `livreID` (`livreID`),
  ADD KEY `FK_reservation` (`adherentID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `adherent`
--
ALTER TABLE `adherent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `author`
--
ALTER TABLE `author`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `livre`
--
ALTER TABLE `livre`
  ADD CONSTRAINT `FK_livre` FOREIGN KEY (`authorId`) REFERENCES `author` (`id`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK_reservation` FOREIGN KEY (`adherentID`) REFERENCES `adherent` (`id`),
  ADD CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`livreID`) REFERENCES `livre` (`isbn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
