# Labs Java - JUnit 4

Ce lab va vous permettre de mettre en œuvre les tests unitaires avec **JUnit 4** à travers une série d'exercices.

---

## Exercice 0 - Mon premier TU :

* Créez votre première classe de test unitaire comprenant au moins 2 tests.
* Lancez-les depuis :
  * Votre IDE.
  * Une commande `maven` qui lance tous les tests.
  * Une commande `maven` qui lance un seul test.

> Indice - de l'aide est disponible sur le wiki *PACK Solutions* [Maven - Test](https://packsolutions.atlassian.net/wiki/spaces/UL/pages/57606358/Maven#Test).

---

## Exercice 1 - Les assertions :

Réaliser les exercices de la classe de test *Exo1AssertsTest*.
* Lancer les tests unitaires 1 par 1.
* Lancer tous les tests via une commande `maven` (il y a 2 pièges).

---

## Exercice 2 - Tester les exceptions :

De 3 manières différentes, veuillez tester que des exceptions soient levées dans *Exo2ExceptionsTest*.

---

## Exercice 3 - Timeout

* Vérifier que le test *testSlaIsRespected1* de la classe *Exo3TimeoutTest* soit exécuté en moins de **100 millisecondes**.
* Utiliser une *Rule* qui vérifie que tous les tests de la classe *Exo3TimeoutTest* soient exécutés en moins de **150 millisecondes** (*testSlaIsNotRespected* ne doit pas passer).

---

## Exercice 4 - Test de classe Utils

En mode TDD, créer un test qui vérifie qu'une `Person` soit majeure via une classe utilitaire qui sera ensuite créée.
De la même façon, créer un test qui va vérifier qu'une `Person` est mineure.

---

## Exercice 5 - Test de service

* Avant le lancement du premier test, afficher le message : "C'est parti mes petits tests !! 😊".
* Tester de manière exhaustive la classe `PeopleExportService`.
* Les fichiers doivent être générés dans des dossiers temporaires et être automatiquement supprimés en fin de test (que le test ait fini en succès ou en échec).
* Après l'exécution du dernier test, afficher le message : "Yo Bro ! C'est fini 🥳🎉".

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
