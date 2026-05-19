## Unit Testing Exercise #2

Write a DiscountCalculator class that calculates the discount based on the type of customer G (Gold), S (Sliver), B (Bronze)  and subtotal as follows:  
Note your class should have one method that takes a char (customer type) and a double(subtotal) as arguments and returns a double (total).

Write a test class so that your DiscountCalculator class has 100% code coverage.


| Customer Type | Subtotal        | Discount Applied |
|---------------|-----------------|------------------|
| G	            | >=250	          | 20%              |
| G	            | >=100 and <250  | 10% |
| G             | < 100           | 5%  |
| S             | >=200           | 10% |
| S             | >=100 and < 200 | 5%  |
| S             | <100            | 0   |
| B             | >=300           | 5%  |
| B             | <300            | 0%  |

---

[DiscountCalculator.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk5/DiscountCalculator.java)  
[DiscountCalculatorTest.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/Test/ait/sdt/wk5/DiscountCalculatorTest.java)