select unique_id,name 
from Employees e
left join EmployeeUNI ui on e.id=ui.id;