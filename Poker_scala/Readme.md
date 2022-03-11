# Projet Poker 

* Willy Francois
* Ines Garcia
* Axelle Donot

Voici notre projet scala : un calculateur de probabilités pour le poker.

La variante jouée est celle du Texas Hold'Em (2 cartes fermées, 5 cartes ouvertes).

Voici les fonctions que nous avons implémenté :

* fonction qui prend un ensemble de cinq cartes ou plus, et retourne la
meilleure main de cinq cartes dans cet ensemble.

* fonction qui prend un ensemble de n cartes distribuées pour un joueur
(ouvertes ou fermées), un nombre m de cartes restant à distribuer, et
calcule, pour chaque main, la probabilité que le joueur obtienne cette
main à la fin de la distribution (si m = 0, alors il s’agit simplement de
déterminer quelle main le joueur a, sinon il faudra prendre en compte
les différentes possibilités en fonction des cartes restant dans le jeu).

* fonction qui prend les deux cartes fermées d’un joueur, le tableau (0,
3, 4 ou 5 cartes) et le nombre d’adversaires, et retourne la probabilité
pour le joueur d’avoir la meilleure main à la fin de la distribution.

* fonction qui prend les deux cartes fermées de chaque joueur, le tableau
(0, 3, 4 ou 5 cartes), et calcule pour chaque joueur la probabilité
d’avoir la meilleur main à la fin de la distribution.

