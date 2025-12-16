select name,bonus 
from  Employee e
left join Bonus b on b.empId=e.empID where bonus <1000 or bonus is null