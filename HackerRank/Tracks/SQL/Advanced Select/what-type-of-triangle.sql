SELECT
    IF( A+B <= C OR B+C <= A OR C+A <= B , "Not A Triangle",
CASE
    WHEN A = B AND B = C THEN "Equilateral"
    WHEN A = B OR B = C OR C = A THEN "Isosceles"
    WHEN A != B AND B != C AND C != A THEN "Scalene"
END )
FROM TRIANGLES;