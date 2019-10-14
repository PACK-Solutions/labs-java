# Labs Java - JUnit 4

Ce lab va vous permettre de mettre en oeuvre les tests unitaires avec **JUnit 4** à travers une série d'exercices.

---

## Exercice 0 - Mon premier TU :

* Créez votre première classe de test unitaire comprenant au moins 2 tests
* Lancez-le depuis :
  * Votre IDE
  * Une commande `maven` qui lance tous les tests
  * Une commande `maven` qui lance un seul test

> Indice - de l'aide est disponible sur le wiki *PACK Solutions* [Maven - Test](https://redmine.pack-solutions.net/projects/pro-pac/wiki/Maven#Test)

---

## Exercice 1 - Les assertions :

Réaliser les exercices de la classe de tests *Exo1AssertsTest*
* Lancer les tests unitaires 1 par 1
* Lancer tous les tests via une commande `maven` (il y a un piège)

---

## Exercice 2 - Tester les exceptions :

De 3 manières différents, veuillez tester que des exceptions soient levées dans *Exo2ExceptionsTest*

---

## Exercice 3 - Timeout

Vérifier que le test de *Exo3TimeoutTest* soit exécuté en moins de 10 secondes

---

## Exercice 4 - Test de classe Helper

En mode TDD, créer un test qui vérifie qu'une `Person` soit majeur via une classe helper qui sera ensuite créée.
De la même façon créer un test qui va vérifier qu'une `Person` est mineure.

---

## Exercice 5 - Test de service

* Avant le lancement du premier test, afficher le message : "C'est parti mes petits tests !! 😊"
* Tester de manière exhaustive la classe `PeopleExportService`
* Les fichiers doivent être générés dans des dossiers temporaires automatiquement supprimé en fin de test (que le test ait fini en succès ou en échec)
* Après l'exécution du dernier test, afficher le message : "Yo Bro ! C'est fini 🥳🎉"

---

## Aller plus loin :

* [Test runners](https://github.com/junit-team/junit4/wiki/Test-runners)
* [Aggregating tests in suites](https://github.com/junit-team/junit4/wiki/Aggregating-tests-in-suites)
* [Categories](https://github.com/junit-team/junit4/wiki/Categories)
* [Parameterized tests](https://github.com/junit-team/junit4/wiki/Parameterized-tests)
* [Assumptions with assume](https://github.com/junit-team/junit4/wiki/Assumptions-with-assume)
* `JUnit 5`
  * https://junit.org/junit5/docs/current/user-guide/
  * https://www.jmdoudoux.fr/java/dej/chap-junit5.htm
  * https://www.baeldung.com/junit-5-migration
  * https://howtodoinjava.com/junit5/junit-5-vs-junit-4/
