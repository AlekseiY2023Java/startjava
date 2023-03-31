\echo 'выведите всю таблицу'
SELECT *
  FROM Jaegers;
  
\echo 'отобразите только не уничтоженных роботов'
SELECT *
  FROM Jaegers
 WHERE status = 'Active';
 
\echo 'отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');
 
\echo 'отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'отсортируйте таблицу по убыванию по столбцу mark'
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;
 
\echo 'отобразите информацию о самом старом роботе'
SELECT *
  FROM Jaegers 
 WHERE launch = 
       (SELECT MIN(launch) 
          FROM Jaegers);
		  
\echo 'отобразите роботов, которые уничтожили больше всех kaiju'
SELECT *
  FROM Jaegers
 WHERE kaijuKill = 
       (SELECT MAX(kaijuKill) 
          FROM Jaegers);

\echo 'отобразите средний вес роботов'
SELECT AVG(weight) AS averageWeight
  FROM Jaegers;

\echo 'увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE Jaegers
   SET kaijuKill = (kaijuKill + 1)
 WHERE status = 'Active';

\echo 'удалите уничтоженных роботов'
DELETE FROM Jaegers
 WHERE status = 'Destroyed';