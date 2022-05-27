SELECT name FROM St GROUP name HAVING min(score)>=60;

SELECT name,avg(score) FROM st GROUP name
HAVING avg(score)>=all(
 SELECT avg(score).FROM St GROUP BY name
);

SELECT name,max(score) FROM St;