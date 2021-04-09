package list;

public class listEmp {
	void inputList(Employee[] list, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Nhan vien thu " + (i + 1) + ": ");
			list[i] = new Employee();
			list[i].input();
			list[i].calSalary();
                        
		}
    }
    void outputList(Employee[] list, int n) {
		for (int i = 0; i < n; i++)
			list[i].output();
                
	}
    
    void tang(Employee[] list, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (list[i].salary > list[j].salary) {
					Employee tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
	}

    void giam(Employee[] list, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (list[i].salary < list[j].salary) {
					Employee tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}       
	}
}

