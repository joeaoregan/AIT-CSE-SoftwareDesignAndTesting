## Unit Testing Exercise#1

Write a StudentGrade class that converts a mark (integer value between 0 and 100) into a grade as follows:  
(Note your class should have one method that takes an int as an argument and returns a char)

```
>= 85 : A
>= 70 and < 85 : B
>= 55 and < 70 : C
>=40 and < 55 : D
>=25 and < 40: E
<25 :F
```

There is no need to handle values less than zero or greater than 100.  
Write a class call StudentGradeTest that fully tests your code.

```
 ▾ 📄 com.ait.test.StudentGradeTest
     📄 testGradeA
     📄 testGradeB
     📄 testGradeC
     📄 testGradeD
     📄 testGradeE
     📄 testGradeF
```

```
 ▾ 📦 com.ait.student       100.0%
   > 📄 StudentGrade.java   100.0%
```

---

[StudentGrade.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk5/StudentGrade.java)  
[StudentGradeTest.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/Test/ait/sdt/wk5/StudentGradeTest.java)