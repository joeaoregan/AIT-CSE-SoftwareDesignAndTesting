## Unit Testing Cat Pound Exercise

```
+-----------------------------------------+
|               + CatPound                |
+-----------------------------------------+               +-----------------+
|                                         |               |      + Cat      |
+-----------------------------------------+  0..1    0..* +-----------------+
| +addCat(aCat : Cat)                     |-------------->| -name : String  |
| +getNumberOfCats() : Integer            |               | -age : Integer  |
| +removeCat(aCat : Cat)                  |               | -color : String |
| +searchCatName(name : String) : Boolean |               +-----------------+
| +findCat(aCat : Cat) : Boolean          |               |                 |
| +getNumberOfOlderThan() : Integer       |               +-----------------+
+-----------------------------------------+                _________________
                                                          | getter & setter |
                                                          | methods for Cat |
                                                          |_________________|
```

A CatPound contains a collection of cats. 

We assume a cat is identified by its name (assume unique).

The CatPound will implement the following User Stories

1.	As a cat pound assistant, I want to be able to check how many cats are in the CatPound so that I will know if we have reached our capacity
2.	As a cat pound assistant I want to be able to add a cat to the CatPound so that all cats accepted by the pound are accounted for
3.	As a cat pound assistant I want to be able to remove a cat from the CatPound so that a cat is removed when it is no longer resident in the CatPound.
4.	As a cat pound assistant I want to be able to search by cat name so that I can locate a cat with a particular name.
5.	As a cat pound administrator I want to know how many cats over a certain age are present in the pound so that old cats can be put down.

First write a unit test class CatTest for the Cat that tests the constructor and the getters and setters.

Now we will test the Cat Pound functionality – **try and write the tests before the code NB**

### User Story 1 – check number of cats in pound

Test 1-1 – Before any cats are added to the pound, there should be no cats in the pound
Note:Other tests for this user story will be completed as part of Story 2 and 3 after cats have been added or removed. Test 2-1 is duplication of this test also but we will leave it here for completeness

### User Story 2 – adding a cat to the pound

Test 2-1 An empty cat pound(no cats added) should return zero when the number of cats is retrieved from the cat pound.
Test 2-2 – Adding a cat to an empty pound should return one when the number of cats is retrieved from the pound
Test 2-3 – Adding two cats to an emptypound should return two when the number of cats is retrieved from the pound.
Test 2-4 – If we add a cat to the pound, we should be able to ask if it’s there. Conversely, we should receive a negative response when we ask about a cat we haven’t added. Check for the cat using its object reference (contains). This is the findCat method from the diagram.

### User Story 3 – removing a cat from the pound

Test 3-1  If a cat is added to the pound and then removed, test that it can no longer be found –findCat method. Note: the remove method removes an object from the arrayList.

### User Story 4 – search for a cat by name

Test 4-1 Search by name. Check if a cat with a specific name is in the pound. Check that true is returned if the cat has been added to the pound, otherwise false.

### User Story 5 – search for a cats greater than a certain age

Test 5-1 Search by age. Check correct value is returned.

---

- [Cat.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk5/Cat.java)  
- [CatTest.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/Test/ait/sdt/wk5/CatTest.java)