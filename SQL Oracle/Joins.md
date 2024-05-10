# NATURAL JOIN

1: 
SQL> select * from tableOne natural join tableTwo;

       EID ENAME          ROLLNO         ID
---------- ---------- ---------- ----------
         1 karan              67          2
         2 kaif               65          3

2: 
SQL> select * from tableOne join tableTwo using (ename); 

ENAME             EID     ROLLNO        EID         ID
---------- ---------- ---------- ---------- ----------
karan               1         67          1          2
kaif                2         65          2          3

SQL> select * from tableOne join tableTwo using (eid);   

       EID ENAME          ROLLNO ENAME              ID
---------- ---------- ---------- ---------- ----------
         1 karan              67 karan               2
         2 kaif               65 kaif                3

3: 
SQL> select * from tableOne join tableTwo on(tableOne.ename = tableTwo.ename);

       EID ENAME          ROLLNO        EID ENAME              ID
---------- ---------- ---------- ---------- ---------- ----------
         1 karan              67          1 karan               2
         2 kaif               65          2 kaif                3

# OUTER JOINS

4: 
SQL> select * from tableOne left outer join tabletwo using(ename);

ENAME             EID     ROLLNO        EID         ID
---------- ---------- ---------- ---------- ----------
karan               1         67          1          2
kaif                2         65          2          3
dhruv               3         48

5: 
SQL> select * from tableOne t1 left outer join tabletwo t2 on(t1.ename = t2.ename);

       EID ENAME          ROLLNO        EID ENAME              ID
---------- ---------- ---------- ---------- ---------- ----------
         1 karan              67          1 karan               2
         2 kaif               65          2 kaif                3
         3 dhruv              48

6: 
SQL> select * from tableOne t1 right outer join tabletwo t2 on(t1.ename = t2.ename); 

       EID ENAME          ROLLNO        EID ENAME              ID
---------- ---------- ---------- ---------- ---------- ----------
         1 karan              67          1 karan               2
         2 kaif               65          2 kaif                3

7: 
SQL> select * from tableOne t1 full outer join tabletwo t2 on(t1.ename = t2.ename);  

       EID ENAME          ROLLNO        EID ENAME              ID
---------- ---------- ---------- ---------- ---------- ----------
         1 karan              67          1 karan               2
         2 kaif               65          2 kaif                3
         3 dhruv              48

# SELF JOIN

8: 
SQL> select e.LAST_NAME as "empName", m.LAST_NAME as "mngName" from employees m join employees e on(m.EMPLOYEE_ID = e.MANAGER_ID);

empName                   mngName
------------------------- -------------------------
Abel                      Zlotkey
Ande                      Errazuriz
Atkinson                  Fripp
Austin                    Hunold
Baer                      Kochhar
Baida                     Raphaely
Banda                     Errazuriz
Bates                     Cambrault
Bell                      Vollman
Bernstein                 Russell
Bissot                    Fripp

# CROSS JOIN

9: 
SQL> select * from tableOne cross join tableTwo; 

       EID ENAME          ROLLNO        EID ENAME              ID
---------- ---------- ---------- ---------- ---------- ----------
         1 karan              67          1 karan               2
         2 kaif               65          1 karan               2
         3 dhruv              48          1 karan               2
         1 karan              67          2 kaif                3
         2 kaif               65          2 kaif                3
         3 dhruv              48          2 kaif                3

6 rows selected.