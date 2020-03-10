# Labs Java - Mocks

Ce lab va vous permettre d'appréhender les mocks via **Mockito 1** et **Spring**, lors de vos tests unitaires **JUnit 4** à travers une série d'exercices.

> Prérequis : avoir réalisé le [lab JUnit 4](https://github.com/PACK-Solutions/labs-java/tree/master/lab-junit-4).

---

## Exercice 0 - Mon premier mock :

Créer une classe de test `Exo0FirstMock` avec une méthode `testFirstMock` :
* Créer une liste de string mockée, lancez-le test.
* Ajouter "Yo !" à cette liste et vérifiez avec `Mockito` que cet ajout ait bien été réalisé et qu'il n'y a pas eu d'autre interaction, lancez-le test.
* Faites un clear de la liste, que se passe-t-il ? Corriger le test.

---

## Exercice 1 - Stubbing / Argument Matchers

Réalisez les exercices de la classe `Exo1StubbingTest`.

---

## Exercice 2 - Appel vrai méthode et vérification des interactions

Réalisez les exercices de la classe `Exo2CalculatorService`.

---

## Exercice 3 - Mock Services

De 3 façons différentes d'instancier vos mocks, tester la méthode `crazyAdd` de `CrazyCalculatorService`.

> Indice - cf. instanciation vue jusqu'à présent, les annotations et les runners.

---

## Exercice 4 - Spy

* Tester 2 façons différentes d'instancier vos espions.
* Tester la méthode `crazyAdd` de `CrazyCalculatorService` sans stubbing.
* Tester la méthode `crazySubstract` sans stubbing, que se passe-t-il ? Trouver une solution pour faire passer le test.

> Attention - Vous ne devez pas instancier de **Mock**.

---

## Exercice 5 - Spring - Mock Propriétés

Créer 3 classes de tests différentes pour tester la classe d'injection de propriétés `ConfigProperties` :
* Tester les valeurs par défaut.
* Modifier l'état interne des valeurs via `Mockito` et tester ces nouvelles valeurs.
* Utiliser l'élément de `Spring` permettant de modifier les valeurs et tester les.

---

## Exercice 6 - Spring - Mock REST / ArgumentCaptor (@Captor)

Tester de la manière la plus proche de la réalité, les endpoints REST de la classe `PersonController`.

> Indice - Utiliser les notions suivantes : `MockMvc`, les matchers **Hamcrest**. et `ArgumentCaptor` sur les `verify`.

---

## Aller plus loin :

* [Mockito site officiel (v3 current version)](https://site.mockito.org/)
* [Mockito 1.10.9 Doc](https://javadoc.io/doc/org.mockito/mockito-core/1.10.9/org/mockito/Mockito.html)
* [Spring Framework Testing](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html)
* Mocker une méthode static est une mauvaise pratique (cf [Mockito #1013](https://github.com/mockito/mockito/issues/1013)) (**PowerMock** peut être utilisé pour ce use case mais son usage est à éviter car bad practice et lenteurs dû à la reflection).
* Documentation _PACK Solutions_ sur les tests unitaires **Java** :
  * [Mockito](https://packsolutions.atlassian.net/wiki/spaces/DEV/pages/139034745/Java+-+Tests+unitaires#Mockito)
  * [Tests Spring](https://packsolutions.atlassian.net/wiki/spaces/DEV/pages/139034745/Java+-+Tests+unitaires#Spring)
