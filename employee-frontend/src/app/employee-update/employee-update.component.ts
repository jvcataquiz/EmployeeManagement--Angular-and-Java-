import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-update',
  templateUrl: './employee-update.component.html',
  styleUrls: ['./employee-update.component.css']
})
export class EmployeeUpdateComponent implements OnInit {
  id!: number;
  employee: Employee = new Employee();
  constructor(private employeeService: EmployeeService,
    private routeparams: ActivatedRoute,
    private route: Router) { }

  ngOnInit(): void {
   this.id = this.routeparams.snapshot.params['id'];
   this.employeeService.getEmployeeById(this.id).subscribe(data =>{
    this.employee = data;
   });
  }
  onSubmit(){
    
  }

  goToEmployeeList(){
    this.route.navigate(['/employees']);
  }

}
