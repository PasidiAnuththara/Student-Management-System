import java.util.*;

class StudentManagementSystem {
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    // Batch data
    public static int[] batchNameArray = { 105, 106, 107, 108, 109, 110 };
    public static int[] batchStatusArray = { 0, 0, 0, 0, 1, 1 };
    public static int[] studidArray=new int[0];
    public static int studentCount = 25;

    // Student data
    public static String[] regNoArray = {
            "PR24105001", "PR24105002", "PR24105003", "PR24105004", "PR24105005",
            "PR24105006", "PR24105007", "PR24105008", "PR24105009", "PR24105010",
            "OR24105011", "OR24105012", "OR24105013", "OR24105014", "OR24105015",
            "PR24105016", "PR24105017", "PR24105018", "OR24105019", "OR24105020",
            "PR24105021", "PR24105022", "OR24105023", "OR24105024", "PR24105025",
            "PR24106001", "PR24106002", "PR24106003", "PR24106004", "PR24106005",
            "PR24106006", "PR24106007", "PR24106008", "PR24106009", "PR24106010",
            "OR24106011", "OR24106012", "OR24106013", "OR24106014", "OR24106015",
            "PR24106016", "PR24106017", "PR24106018", "OR24106019", "OR24106020",
            "PR24106021", "PR24106022", "OR24106023", "OR24106024", "PR24106025",
            "PR24107001", "PR24107002", "PR24107003", "PR24107004", "PR24107005",
            "PR24107006", "PR24107007", "PR24107008", "PR24107009", "PR24107010",
            "OR24107011", "OR24107012", "OR24107013", "OR24107014", "OR24107015",
            "PR24107016", "PR24107017", "PR24107018", "OR24107019", "OR24107020",
            "PR24107021", "PR24107022", "OR24107023", "OR24107024", "PR24107025",
            "PR24108001", "PR24108002", "PR24108003", "PR24108004", "PR24108005",
            "PR24108006", "PR24108007", "PR24108008", "PR24108009", "PR24108010",
            "OR24108011", "OR24108012", "OR24108013", "OR24108014", "OR24108015",
            "PR24108016", "PR24108017", "PR24108018", "OR24108019", "OR24108020",
            "PR24108021", "PR24108022", "OR24108023", "OR24108024", "PR24108025",
            "PR24109001", "PR24109002", "PR24109003", "PR24109004", "PR24109005",
            "PR24109006", "PR24109007", "PR24109008", "PR24109009", "PR24109010",
            "OR24109011", "OR24109012", "OR24109013", "OR24109014", "OR24109015",
            "PR24109016", "PR24109017", "PR24109018", "OR24109019", "OR24109020",
            "PR24109021", "PR24109022", "OR24109023", "OR24109024", "PR24109025",
            "PR24110001", "PR24110002", "PR24110003", "PR24110004", "PR24110005",
            "PR24110006", "PR24110007", "PR24110008", "PR24110009", "PR24110010",
            "OR24110011", "OR24110012", "OR24110013", "OR24110014", "OR24110015",
            "PR24110016", "PR24110017", "PR24110018", "OR24110019", "OR24110020",
            "PR24110021", "PR24110022", "OR24110023", "OR24110024", "PR24110025"

    };

    public static String[] nicArray = {
            "199501012345", "199503153872", "199506202198", "199509102983", "199511258739",
            "199512303498", "199502183764", "199504223198", "199508153210", "199510293417",
            "199601102375", "199604182938", "199606243879", "199608142178", "199610312475",
            "199611173452", "199603293481", "199605083217", "199607232198", "199609192375",
            "199701212483", "199703132487", "199706253478", "199708083298", "199710243651",
            "199712152983", "199702182734", "199704293187", "199705142375", "199709083751",
            "199801032874", "199803232871", "199806193428", "199808013764", "199810242374",
            "199812302984", "199802152348", "199805213471", "199807172398", "199811283472",
            "199901122471", "199903052984", "199906213874", "199908093412", "199910273894",
            "199912153482", "199902202394", "199904163874", "199907293481", "199911083479",
            "200001112374", "200003143478", "200006293874", "200008103471", "200010252984",
            "200012043894", "200002193874", "200004212374", "200005183492", "200007153871",
            "200101232984", "200103083471", "200106273894", "200108123984", "200110043728",
            "200112213874", "200102253471", "200104103874", "200105293784", "200107202983",
            "200201013874", "200203253471", "200206143874", "200208083471", "200210293874",
            "200212183471", "200202103874", "200204123894", "200205283471", "200207153874",
            "200301093874", "200303283471", "200306153874", "200308123471", "200310083874",
            "200312243471", "200302273874", "200304203471", "200305123874", "200307213471",
            "200401153874", "200403123471", "200406293874", "200408083471", "200410213874",
            "200412153471", "200402203874", "200404273471", "200405143874", "200407183471",
            "200501023874", "200503193471", "200506153874", "200508213471", "200510083874",
            "200512293471", "200502123874", "200504153471", "200505283874", "200507173471"
            ,"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678"
        };

    public static String[] nameArray = {
            "Gunawardena Weerasinghe", "Senanayake Silva", "Silva Kumara", "Kumara Herath", "Rathnayake Herath",
            "Wijesinghe Bandara", "Rajapaksha Herath", "Senanayake Karunaratne", "Karunaratne Jayasinghe",
            "Gunawardena Silva",
            "Weerasinghe Rajapaksha", "Silva Rathnayake", "Fernando Perera", "Kumara Abeysekera",
            "Ekanayake Rathnayake",
            "Herath Gunawardena", "Abeysekera Silva", "Weerasinghe Silva", "Jayasinghe Dias", "Bandara Rathnayake",
            "Silva Perera", "De Silva Dias", "Abeysekera Jayasinghe", "Rajapaksha Senanayake", "Kumara Karunaratne",
            "Silva Abeysekera", "Jayasinghe Bandara", "Rathnayake Kumara", "Weerasinghe Rajapaksha",
            "Senanayake Herath",
            "Perera Ekanayake", "Herath Jayasinghe", "Kumara Gunawardena", "Abeysekera Silva", "Dias Fernando",
            "Karunaratne Weerasinghe", "Ekanayake Bandara", "Rajapaksha Kumara", "Silva De Silva",
            "Gunawardena Rathnayake",
            "Bandara Karunaratne", "Fernando Perera", "De Silva Silva", "Rajapaksha Gunawardena", "Herath Weerasinghe",
            "Karunaratne Dias", "Jayasinghe Silva", "Senanayake Abeysekera", "Silva Jayasinghe", "Rathnayake Kumara",
            "Gunawardena Kumara", "Rajapaksha Silva", "Perera Jayasinghe", "Silva Ekanayake", "Dias Senanayake",
            "Herath Abeysekera", "Rathnayake Fernando", "Kumara Herath", "Weerasinghe Silva", "Senanayake Karunaratne",
            "Abeysekera Silva", "Bandara Gunawardena", "Karunaratne Weerasinghe", "Perera Herath", "Fernando Dias",
            "Weerasinghe Gunawardena", "Rathnayake Kumara", "Senanayake Fernando", "Silva Bandara", "Herath Rajapaksha",
            "Kumara Jayasinghe", "Abeysekera Perera", "Rathnayake Jayasinghe", "Kumara Weerasinghe",
            "Rajapaksha Ekanayake",
            "Fernando Rajapaksha", "Silva Gunawardena", "Perera Wijesinghe", "Herath Abeysekera",
            "Rajapaksha Ekanayake",
            "Karunaratne Silva", "Weerasinghe Fernando", "Silva Bandara", "Abeysekera Weerasinghe",
            "Kumara Karunaratne",
            "Dias Rajapaksha", "Herath Perera", "Rathnayake Gunawardena", "Ekanayake Jayasinghe", "Gunawardena Silva",
            "Rajapaksha Perera", "Karunaratne Jayasinghe", "Weerasinghe Abeysekera", "Rathnayake Fernando",
            "Kumara Herath",
            "Silva Weerasinghe", "Herath Karunaratne", "Abeysekera Silva", "Gunawardena Ekanayake",
            "Weerasinghe Kumara",
            "Weerasinghe Kumara", "Rajapaksha Abeysekera", "Gunawardena Perera", "Karunaratne Silva",
            "Herath Wijesinghe",
            "Rathnayake Ekanayake", "Silva Fernando", "Abeysekera Rajapaksha", "Fernando Bandara", "Perera Herath",
            "Weerasinghe Jayasinghe", "Silva Karunaratne", "Rathnayake Gunawardena", "Herath Kumara",
            "Abeysekera Silva",
            "Ekanayake Bandara", "Rajapaksha Fernando", "Gunawardena Weerasinghe", "Kumara Karunaratne", "Silva Dias",
            "Perera Weerasinghe", "Karunaratne Rajapaksha", "Jayasinghe Silva", "Rathnayake Perera", "Silva Ekanayake",
            "Silva Karunaratne", "Herath Fernando", "Kumara Jayasinghe", "Weerasinghe Perera", "Abeysekera Rajapaksha",
            "Rathnayake Karunaratne", "Ekanayake Bandara", "Gunawardena Perera", "Silva Wijesinghe",
            "Rajapaksha Jayasinghe",
            "Rathnayake Fernando", "Karunaratne Kumara", "Perera Silva", "Gunawardena Ekanayake", "Bandara Rajapaksha",
            "Silva Herath", "Rathnayake Weerasinghe", "Perera Gunawardena", "Herath Karunaratne", "Silva Rajapaksha",
            "Ekanayake Kumara", "Bandara Herath", "Weerasinghe Rajapaksha", "Karunaratne Abeysekera", "Perera Dias",

    };

    public static int[] prfArray = {
            85, 39, -1, 72, 44,
            91, 60, 38, 95, 49,
            -1, 67, 23, 58, 88,
            81, 73, 29, 62, -1,
            79, 53, 94, 47, 35,
            93, 15, -1, 82, 45,
            88, 23, 79, 37, -1,
            68, 100, 59, 29, 92,
            12, 77, 38, 66, 9,
            84, 51, 32, -1, 97,
            95, -1, 63, 88, 32,
            76, 97, 54, -1, 23,
            90, 35, 81, 61, 44,
            67, 100, 17, 85, 29,
            70, 42, -1, 60, 86,
            86, 57, 91, 35, -1,
            76, 48, 94, 23, 69,
            -1, 80, 55, 88, 32,
            100, 67, 43, -1, 90,
            60, 77, 25, 71, 84,
            92, 68, 59, 85, 63,
            76, 91, 70, 84, 63,
            72, 89, 45, 81, 77,
            68, 63, 88, 75, 90,
            57, 79, 92, 62, 100,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2

    };

    public static int[] dbmsArray = {
            66, 45, 93, 58, -1,
            37, 88, 21, 79, 40,
            76, 54, -1, 69, 92,
            25, 84, 33, 60, 71,
            59, -1, 98, 27, 48,
            35, 91, 60, -1, 72,
            49, 26, 80, 14, 89,
            67, -1, 31, 94, 53,
            78, 5, 90, 24, 86,
            39, -1, 61, 73, 100,
            38, 91, -1, 74, 55,
            82, 66, 49, 99, 13,
            80, 70, 93, 36, 59,
            85, 47, 90, -1, 22,
            77, 34, 63, 100, 29,
            79, 62, 87, -1, 54,
            46, 99, 39, 70, -1,
            75, 83, 58, 92, 30,
            91, 40, 63, 95, 68,
            -1, 66, 21, 88, 37,
            67, 91, 85, 73, 70,
            63, 76, 88, 55, 64,
            79, 80, 59, 92, 68,
            100, 77, 83, 45, 62,
            66, 59, 78, 85, 56,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2
    };

    

    // console clear
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

     // Exit
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }


    // home page
    public static void homePage() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tiCET Student Management System\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Student Management");
        System.out.println("\n[2] Batch Management ");
        System.out.println("\n[3] Grade Management");
        System.out.println("\n[4] Report Generator");
        System.out.println("\n[5] Exit");

        Scanner input = new Scanner(System.in);
        do {

            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentManagement();
                    break;
                case 2:
                    clearConsole();
                    batchManagement();
                    break;
                case 3:
                    clearConsole();
                    gradeManagement();
                    break;
                case 4:
                    clearConsole();
                    reportGenerator();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }

    // Student Management
    public static void studentManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tStudent Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Add Student");
        System.out.println("\n[2] Update Student ");
        System.out.println("\n[3] View Student Profile");
        System.out.println("\n[4] Delete Student Profile");
        System.out.println("\n[5] Exit");
	
		Scanner input = new Scanner(System.in);
		do {
			 System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                    clearConsole();
                    addStudent();
                    break;
                    
				case 2:
                    clearConsole();
                    UpdateStudent();
                    break;
                case 3:
                    clearConsole();
                    ViewStudentProfile();
                    break;
                case 4:
                    clearConsole();
                    DeleteStudentProfile();
                    break; 
                case 5:
                    exit();
                    break;   
            } 
		} while(true);	
    }
    
    ////////////////////////Add Student///////////////////////
     public static void addStudent (){
		System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tAdd Student\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        
        while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("\n\nEnter Batch Number (Students should be added): ");
			int batchno=input.nextInt();
			if(checkBatchStatus(batchno)){
				System.out.print("Enter student NIC : ");
				String nicnum=input.next();
			
				if(checkNIC(nicnum)){
					System.out.print("Enter Student Name : ");
					String name=input.next();
				
					System.out.print("Enter Lecture Mode {physical-1 online-0}: ");
					int mode=input.nextInt();
				
					System.out.println("\n");
				
				/*System.out.print("\tStudent Registration No - ");*/
					if(mode==1){
						int[]tempstudidArray=new int[studidArray.length+1];
						for(int i=0;i<studidArray.length;i++){
							tempstudidArray[i]=studidArray[i];
						}
						tempstudidArray[tempstudidArray.length-1]=tempstudidArray.length;
						studidArray=tempstudidArray;
						System.out.print("\tStudent Registration No - PR24"+batchno+studidArray[tempstudidArray.length-1]);
					
					}else{
						int[]tempstudidArray=new int[studidArray.length+1];
						for(int i=0;i<studidArray.length;i++){
							tempstudidArray[i]=studidArray[i];
						}
						tempstudidArray[tempstudidArray.length-1]=tempstudidArray.length;
						studidArray=tempstudidArray;
						System.out.print("\tStudent Registration No - OR24"+batchno+studidArray[tempstudidArray.length-1]);
						/*System.out.print("Student was successfully added to the system.");*/
					}
					System.out.println("\n");
					System.out.println("Student was successfully added to the system.");
				}else{
					System.out.println("\t !!This Student already added to the system..");	
				}
			
			}else{
				System.out.println("\t!!! Students can't added to this batch because enrollment is closed..");
			}
			System.out.print("\nDo you want to add another student  (Y/N) -> ");
			char yORn=input.next().charAt(0);
			if(yORn=='Y' || yORn=='y'){
				continue;
			}else {
				clearConsole();
				homePage();
			}
		}
	}
		
	 
	//check batch status
	 public static boolean checkBatchStatus(int batchno){
		for (int i=0;i<batchNameArray.length;i++){
			if(batchNameArray[i]==batchno){
				if(batchStatusArray[i]==1){
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	 }
	 
	//check NIC
	 public static boolean checkNIC(String nic){
		for(int i=0;i<nicArray.length;i++){
			if(nicArray[i].equals(nic)){
				return false;
			}
		}
		return true;
	 }
	 
	//////////////////////////Update Student////////////////////////
	 public static void UpdateStudent (){
		System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tUpdate Student\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Student Registration No : ");
        String regno=input.next();
        for(int i=0;i<regNoArray.length;i++){
			if(regNoArray[i].equals(regno)){
				System.out.println("\n");
				System.out.println("\tStudent Name: "+nameArray[i]);
				System.out.println("\tStudent NIC: "+nicArray[i]);
				System.out.println("\n");
				
				System.out.println("What do you want to update?");
				System.out.println("\t(01.)Student Name");
				System.out.println("\t(02.)Student NIC");
				System.out.println("\n");
				/*System.out.println("");*/
				
				System.out.println("Enter your option - ");
				int option = input.nextInt();
				
				switch (option) {
					case 1:
						clearConsole();
						updatename(i);
						break;
                    
					case 2:
						clearConsole();
						updatenic(i);
						break;
				}
			}
		}  
	 }
		
	 public static void updatename(int index){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Student Name Update");
		System.out.println("===================");
		System.out.println("\n");
		System.out.println("Registration No :"+regNoArray[index]);
		System.out.println("Student NIC :"+nicArray[index]);
        System.out.print("Student Current Name : "+nameArray[index]);
       
        System.out.print("\nEnter student name to update - ");
        String newname=input.nextLine(); 
        
        nameArray[index]=newname;
        System.out.println("\n\n\tStudent name update successfully...");
        
        System.out.println("\nDo you want to update another student details(Y/N)");
        char yORn=input.next().charAt(0);
			if(yORn=='Y' || yORn=='y'){
				clearConsole();
                UpdateStudent();
			}else {
				clearConsole();
				homePage();
			}
	 }
	 
	 public static void updatenic(int index){
		Scanner input = new Scanner(System.in);
	 
		System.out.println("Student NIC Update");
		System.out.println("===================");
		System.out.println("\n");
		System.out.println("Registration No :"+regNoArray[index]);
        System.out.println("Student Name : "+nameArray[index]);
        System.out.println("Student Current NIC :"+nicArray[index]);
        
        System.out.println("\nEnter student NIC to update - ");
        String newnic=input.nextLine();
        
        nicArray[index]=newnic;
        System.out.println("\n\n\tThis student is already added to the system...");
        
        System.out.println("\nDo you want to update another student details(Y/N)");
        char yORn=input.next().charAt(0);
			if(yORn=='Y' || yORn=='y'){
				clearConsole();
                UpdateStudent();
			}else {
				clearConsole();
				homePage();
			}
	 } 
	 public static int checkRegNo(String regNo){
		int index=-1;
		for(int i=0;i<regNoArray.length;i++){
			if(regNoArray[i].equals(regNo)){
				index=i;
			}
		}
		return index;	
	 }
	////////////////////View Student Profile////////////////////////////
	 public static void ViewStudentProfile (){
		Scanner input = new Scanner(System.in); 
		System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tView Student Profile\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        
        System.out.print("Enter Registration No : ");
        String regNo=input.next();
        
        int index=checkRegNo(regNo);
        
        if(index==-1){
			System.out.println();
			System.out.println("\tThis student does not exist in the system.");
			
			System.out.print("Do you want to search another student details(Y/N)");
			char yORn=input.next().charAt(0);
			if(yORn=='Y' || yORn=='y'){
				clearConsole();
                ViewStudentProfile();
			}else {
				clearConsole();
				homePage();
			}
		}else{
			clearConsole();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t     View Student's Profile     \t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			
			System.out.println("\n\tRegistration No\t: "+regNoArray[index]);
			System.out.println("\tStudent Name\t: "+nameArray[index]);
			System.out.println("\tStudent NIC\t: "+nicArray[index]);
			
			if(prfArray[index]==-1){
				System.out.println("\tStudent DBMS Marks	: Absent");
			}else if(prfArray[index] == -2){
				System.out.println("\tStudent PRF Marks	: Not conducted");
			}else{
				System.out.println("\tStudent PRF Marks: "+prfArray[index]);
			}
			
			if(dbmsArray[index] == -1){
				System.out.println("\tStudent DBMS Marks : Absent");
			}else if(dbmsArray[index] == -2){
				System.out.println("\tStudent DBMS Marks : Not conducted");
			}else{
				System.out.println("\tStudent DBMS Marks :"+dbmsArray[index]);
			}
			
			double gpa=calcGpa(index);
			System.out.println("\tStudent GPA\t:"+gpa);
			
			System.out.print("\nDo you want to search another student details (Y/N): ");
			char yORn=input.next().charAt(0);
			if(yORn=='Y' || yORn=='y'){
				clearConsole();
                ViewStudentProfile();
			}else {
				clearConsole();
				homePage();
			}
		}
	 }
	 
	 public static double calcGpa(int index){
		double prfGpa=0;
		double dbmsGpa=0;
		double totGpa=0;
		if(prfArray[index]==-1){
			prfGpa=0;
		}else if(prfArray[index]==-2){
			prfGpa=0;
		}else{
			if(prfArray[index] >= 90 && prfArray[index] <= 100){
				prfGpa = 4.25;
			}else if(prfArray[index] >= 80 && prfArray[index] <= 89){
				prfGpa = 4.00;
			}else if(prfArray[index] >= 75 && prfArray[index] <= 79){
				prfGpa = 3.70;
			}else if(prfArray[index] >= 70 && prfArray[index] <= 74){
				prfGpa = 3.30;
			}else if(prfArray[index] >= 65 && prfArray[index] <= 69){
				prfGpa = 3.00;
			}else if(prfArray[index] >= 60 && prfArray[index] <= 64){
				prfGpa = 2.70;
			}else if(prfArray[index] >= 55 && prfArray[index] <= 59){
				prfGpa = 2.30;
			}else if(prfArray[index] >= 50 && prfArray[index] <= 54){
				prfGpa = 2.00;
			}else if(prfArray[index] >= 45 && prfArray[index] <= 49){
				prfGpa = 1.70;
			}else if(prfArray[index] >= 40 && prfArray[index] <= 44){
				prfGpa = 1.30;
			}else if(prfArray[index] >= 30 && prfArray[index] <= 39){
				prfGpa = 1.00;
			}else if(prfArray[index] >= 20 && prfArray[index] <= 29){
				prfGpa = 0.70;
			}
		}
		if(dbmsArray[index] == -1){
			dbmsGpa = 0;
		}else if(dbmsArray[index] == -2){
			dbmsGpa = 0;
		}else{
			if(dbmsArray[index] >= 90 && dbmsArray[index] <= 100){
				dbmsGpa = 4.25;
			}else if(dbmsArray[index] >= 80 && dbmsArray[index] <= 89){
				dbmsGpa = 4.00;
			}else if(dbmsArray[index] >= 75 && dbmsArray[index] <= 79){
				dbmsGpa = 3.70;
			}else if(dbmsArray[index] >= 70 && dbmsArray[index] <= 74){
				dbmsGpa = 3.30;
			}else if(dbmsArray[index] >= 65 && dbmsArray[index] <= 69){
				dbmsGpa = 3.00;
			}else if(dbmsArray[index] >= 60 && dbmsArray[index] <= 64){
				dbmsGpa = 2.70;
			}else if(dbmsArray[index] >= 55 && dbmsArray[index] <= 59){
				dbmsGpa = 2.30;
			}else if(dbmsArray[index] >= 50 && dbmsArray[index] <= 54){
				dbmsGpa = 2.00;
			}else if(dbmsArray[index] >= 45 && dbmsArray[index] <= 49){
				dbmsGpa = 1.70;
			}else if(dbmsArray[index] >= 40 && dbmsArray[index] <= 44){
				dbmsGpa = 1.30;
			}else if(dbmsArray[index] >= 30 && dbmsArray[index] <= 39){
				dbmsGpa = 1.00;
			}else if(dbmsArray[index] >= 20 && dbmsArray[index] <= 29){
				dbmsGpa = 0.70;
			}
		}
		totGpa=(prfGpa+dbmsGpa)/2;
		return totGpa;
	 }
	 
	///////////////////////Delete Student Profile/////////////////////
	 public static void DeleteStudentProfile (){
		Scanner input = new Scanner(System.in); 
		
		System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tDelete Student Profile\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        
        System.out.print("Enter Student Registration No : ");
        String regNo=input.next();
        
        int index=checkRegNo(regNo);
        
        if(index==-1){
			System.out.println();
			System.out.println("\tThis student does not exist in the system.");
			
			System.out.print("Do you want to delete another student profile(Y/N)");
			char yORn=input.next().charAt(0);
			if(yORn=='Y' || yORn=='y'){
				clearConsole();
                DeleteStudentProfile();
			}else {
				clearConsole();
				homePage();
			}
		}else{
			clearConsole();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t     Delete Student's Profile     \t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			
			System.out.println("\n\tRegistration No\t: "+regNoArray[index]);
			System.out.println("\tStudent Name\t: "+nameArray[index]);
			System.out.println("\tStudent NIC\t: "+nicArray[index]);
			
			if(prfArray[index]==-1){
				System.out.println("\tStudent DBMS Marks	: Absent");
			}else if(prfArray[index] == -2){
				System.out.println("\tStudent PRF Marks	: Not conducted");
			}else{
				System.out.println("\tStudent PRF Marks: "+prfArray[index]);
			}
			
			if(dbmsArray[index] == -1){
				System.out.println("\tStudent DBMS Marks : Absent");
			}else if(dbmsArray[index] == -2){
				System.out.println("\tStudent DBMS Marks : Not conducted");
			}else{
				System.out.println("\tStudent DBMS Marks :"+dbmsArray[index]);
			}
			
			double gpa=calcGpa(index);
			System.out.println("\tStudent GPA\t:"+gpa);
			
			System.out.print("\nDo you want to delete this student profile (Y/N): ");
			char answer=input.next().charAt(0);
			
			if(answer=='Y' || answer=='y'){
				deletetempdata(index);
				System.out.println("\n\tStudent was successfully deleted from the system.");
				
				System.out.print("\nDo you want to delete another student profile (Y/N): ");
				char yORn = input.next().charAt(0);
				if(yORn=='Y' || yORn=='y'){
					clearConsole();
					DeleteStudentProfile();
				}else if(yORn=='N'||yORn=='n'){
					clearConsole();
					homePage();
				}
			}else if(answer=='N'||answer=='n'){
				clearConsole();
				homePage();
			}
		}
	 }
     
     public static void deletetempdata(int index){
		String[] tempNic=new String[nicArray.length-1]; 
		String[] tempName=new String[nameArray.length-1]; 
		String[] tempID=new String[regNoArray.length-1]; 
		int[] tempPrf=new int[prfArray.length-1];
		int[] tempDbms=new int[dbmsArray.length-1];
		
		for(int i=0;i<regNoArray.length;i++){
			if(i<index){
				tempNic[i]=nicArray[i];	
				tempName[i]=nameArray[i];	
				tempID[i]=regNoArray[i];	
				tempPrf[i]=prfArray[i];	
				tempDbms[i]=dbmsArray[i];
			}
			if(i>index){
				tempNic[i-1]=nicArray[i];	
				tempName[i-1]=nameArray[i];	
				tempID[i-1]=regNoArray[i];	
				tempPrf[i-1]=prfArray[i];	
				tempDbms[i-1]=dbmsArray[i];
			}
		}
		nicArray=tempNic;
		nameArray=tempName;
		regNoArray=tempID;
		prfArray=tempPrf;
		dbmsArray=tempDbms;
	 }

    
    /// Batch Management
    public static void batchManagement() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tBatch Management\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] Add Batch ");
        System.out.println("\n[2] Update Update ");
        System.out.println("\n[3] View Batches ");
        System.out.println("\n[5] Exit");
	
		Scanner input = new Scanner(System.in);
		do {
			 System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                    clearConsole();
                    addBatch();
                    break;
                    
				case 2:
                    clearConsole();
                    updateBatch();
                    break;
                case 3:
                    clearConsole();
                    ViewBatches();
                    break;
                case 4:
                    exit();
                    break;   
            } 
		} while(true);	
    }
    
    //////////////////Add Batch////////////////////////////////////
	public static void addBatch(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tAdd Batch\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
		
		System.out.println("Enter Batch Number : ");
		int batchNum=input.nextInt();
		
		if(batchNum<100){
			System.out.println("\n\tBatch numbers starting from 100.");
			
			System.out.print("\nDo you want to try again (Y/N): ");
			char yORn = input.next().charAt(0);
			
			if(yORn == 'Y' || yORn == 'y'){
				clearConsole();
				addBatch();
			}else{
				clearConsole();
				homePage();
			}
		}else{
			int index=checkBatchNum(batchNum);
			
			if(index!= -1){
				System.out.println("\nBatch is already added to the system.");
				
				System.out.print("\nDo you want to add another batch to the system (Y/N): ");
				char yORn = input.next().charAt(0);
				
				if(yORn == 'Y' || yORn == 'y'){
					clearConsole();
					addBatch();
				}else {
					clearConsole();
					homePage();
				}
			}else{
				System.out.println("\nBatch is successfully added to the system.");
				
				extendBatchArrays(batchNum);
				
				System.out.print("\nDo you want to add another batch to the system (Y/N): ");
				char yORn = input.next().charAt(0);
				
				if(yORn == 'Y' || yORn == 'y'){
					clearConsole();
					addBatch();
				}else if(yORn == 'N' || yORn == 'n'){
					clearConsole();
					homePage();
				}
			}
		}
	}
	
	public static void extendBatchArrays(int batchNum){
		int[]tempBatchName=new int[batchNameArray.length+1];
		int[]tempBatchStatus=new int[batchStatusArray.length+1];
		
		for(int i=0;i<batchNameArray.length;i++){
			tempBatchName[i]=batchNameArray[i];
			tempBatchStatus[i]=batchStatusArray[i];
		}
		tempBatchName[tempBatchName.length-1] = batchNum;
		tempBatchStatus[tempBatchStatus.length-1] = 1;
		
		batchNameArray = tempBatchName;
		batchStatusArray =tempBatchStatus;
	}

    public static int checkBatchNum(int batchNum){
		int index=-1;
		for(int i=0;i<batchNameArray.length;i++){
			if(batchNameArray[i]==batchNum){
				index=i;
			}
		}
		return index;
	}
	
	///////////////////////////update batch////////////////////////
    public static void updateBatch(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tUpdate Batch\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
		
		System.out.println("Enter Batch Number : ");
		int batchNum=input.nextInt();
		
		int index=checkBatchNum(batchNum);
		
		if(index == -1){
			System.out.println("\n\tThis batch does not exist in the system.");
			
			System.out.print("\nDo you want to update another batch details (Y/N): ");
			char option = input.next().charAt(0);
			
			if(option == 'Y' || option == 'y'){
				clearConsole();
				updateBatch();
			}else{
				clearConsole();
				homePage();
			}	
		}else{
			if(batchStatusArray[index] == ENROLLMENTOPEN){
				System.out.println("\nCurrent Status	: ENROLLMENT OPEN");
				
				System.out.print("\n\nDo you want to change the batch status to ENROLLMENT CLOSED (Y/N) ? ");
				char answer = input.next().charAt(0);
				
				if(answer == 'Y' || answer == 'y'){
					batchStatusArray[index] = ENROLLMENTCLOSED;
					System.out.print("\n\tBatch Status updated successfully...");
					
					System.out.print("\n\nDo you want to update another batch details (Y/N): ");
					char yORn = input.next().charAt(0);
					
					if(yORn == 'Y' || yORn == 'y'){
						clearConsole();
						updateBatch();
					}else{
						clearConsole();
						homePage();
					}
				}
			}else if (batchStatusArray[index] == ENROLLMENTCLOSED){
				System.out.println("\nCurrent Status	: ENROLLMENT CLOSED");
				
				System.out.print("\n\nDo you want to change the batch status to ENROLLMENT OPEN (Y/N) ? ");
				char answer = input.next().charAt(0);
				
				if(answer == 'Y' || answer == 'y'){
					batchStatusArray[index] = ENROLLMENTOPEN;
					System.out.print("\n\tBatch Status updated successfully...");
					
					System.out.print("\n\nDo you want to update another batch details (Y/N): ");
					char option = input.next().charAt(0);
					
					if(option == 'Y' || option == 'y'){
						clearConsole();
						updateBatch();
					}else if(option == 'N' || option == 'n'){
						clearConsole();
						homePage();
					}
				}	
			}
		}	
	}
	
	/////////////////////////View Batch///////////////////////////
	public static void ViewBatches(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tView Batch\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        
        System.out.println("-----------------------------------------------");
		System.out.println("No    Batch No    Student Count    Status");
		System.out.println("-----------------------------------------------");

		for (int i = 0; i < batchNameArray.length; i++) {
			System.out.println((i + 1) + "     " + batchNameArray[i] + "       " + studentCount);

			if (batchStatusArray[i] == ENROLLMENTOPEN) {
				System.out.println("                                  ENROLLMENT OPEN");
			} else {
				System.out.println("                                  ENROLLMENT CLOSED");
			}
			System.out.println("-----------------------------------------------");
		}
		System.out.print("\nDo you want to go to the home page (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			homePage();
		}else {
			clearConsole();
			ViewBatches();
		}
	}  
	
    // Grade Management
    public static void gradeManagement() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tGrade Management\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] PRF Marks Update");
        System.out.println("\n[2] DBMS Marks Update ");
        System.out.println("\n[3] Exit");
        
		Scanner input=new Scanner(System.in);
		
		System.out.print("\n\nEnter an option to continue > ");
        int option = input.nextInt();
          
        switch (option) {
            case 1:
                clearConsole();
                prfmarksupdate();
                break;
                    
			case 2:
                clearConsole();
                dbmsmarksupdate();
                break;
            case 4:
				exit();
                break;   
        } 	
    }

public static void prfmarksupdate() {
    System.out.println("-------------------------------------------------------------------------");
    System.out.println("|\t\t\t\tPRF Marks Update\t\t\t|");
    System.out.println("-------------------------------------------------------------------------\n");

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Student Registration No : ");
    String regNo = input.next();

    int index = checkRegNo(regNo);

    if (index == -1) {

        System.out.println("\n\tThis student not exist in the system");

        System.out.print("\nDo you want to try again (Y/N): ");
        char yORn = input.next().charAt(0);

        if (yORn == 'Y' || yORn == 'y') {
            clearConsole();
            prfmarksupdate();

        } else {
            clearConsole();
            homePage();
        }

    } else {

        clearConsole();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t     PRF Marks Update     \t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        System.out.println("\n\tRegistration No\t: " + regNoArray[index]);
        System.out.println("\tStudent Name\t: " + nameArray[index]);
        System.out.println("\tStudent NIC\t: " + nicArray[index]);

        if (regNoArray[index].charAt(0) == 'O') {

            System.out.print("\tEnter PRF Marks : ");
            int prfMark = input.nextInt();

            prfArray[index] = prfMark;

            System.out.println("\n\tThis student PRF Marks updated successfully...");

            System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
            char answer = input.next().charAt(0);

            if (answer == 'Y' || answer == 'y') {
                clearConsole();
                prfmarksupdate();

            } else if (answer == 'N' || answer == 'n') {
                clearConsole();
                homePage();
            }

        } else {

            if (prfArray[index] == -1) {

                System.out.println(
                    "\nThis student was absent from the exam. You can update the marks if they participate in it...."
                );

                System.out.print("\n\tEnter PRF Marks : ");
                int prfMark = input.nextInt();

                prfArray[index] = prfMark;

                System.out.println("\n\tThis student PRF Marks updated successfully...");

                System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
                char answer = input.next().charAt(0);

                if (answer == 'Y' || answer == 'y') {
                    clearConsole();
                    prfmarksupdate();

                } else if (answer == 'N' || answer == 'n') {
                    clearConsole();
                    homePage();
                }

            } else {

                System.out.println("\nThis student has already completed the PRF module.");
                System.out.println("\n\tPRF Marks : " + prfArray[index]);

                System.out.print("\nDo you want to update this student's PRF marks ? ");
                char answer = input.next().charAt(0);

                if (answer == 'Y' || answer == 'y') {

                    System.out.print("\n\tEnter PRF Marks : ");
                    int prfMark = input.nextInt();

                    prfArray[index] = prfMark;

                    System.out.println("\n\tThis student PRF Marks updated successfully...");

                    System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
                    char yORn = input.next().charAt(0);

                    if (yORn == 'Y' || yORn == 'y') {
                        clearConsole();
                        prfmarksupdate();

                    } else if (yORn == 'N' || yORn == 'n') {
                        clearConsole();
                        homePage();
                    }

                } else if (answer == 'N' || answer == 'n') {

                    clearConsole();
                    homePage();
                }
            }
        }
    }
}

public static void dbmsmarksupdate() {
    System.out.println("-------------------------------------------------------------------------");
    System.out.println("|\t\t\tDBMS Marks Update\t\t\t|");
    System.out.println("-------------------------------------------------------------------------\n");

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Student Registration No : ");
    String regNo = input.next();

    int index = checkRegNo(regNo);

    if (index == -1) {

        System.out.println("\n\tThis student not exist in the system");

        System.out.print("\nDo you want to try again (Y/N): ");
        char yORn = input.next().charAt(0);

        if (yORn == 'Y' || yORn == 'y') {
            clearConsole();
            dbmsmarksupdate();

        } else {
            clearConsole();
            homePage();
        }

    } else {

        clearConsole();
        
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tDBMS Marks Update\t\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
		
			System.out.println("\n\n\tRegistration No	: "+regNoArray[index]);
			System.out.println("\tStudent Name	: "+nameArray[index]);
			System.out.println("\tStudent NIC	: "+nicArray[index]);
			
			if(regNoArray[index].charAt(0) == 'P'){
				
				if(dbmsArray[index] == -1){
					
					System.out.println("\nThis student was absent from the exam. You can update the marks if they participate in it....");
					System.out.print("\n\tEnter DBMS Marks : ");
					
					int dbmsMark = input.nextInt();
					
					dbmsArray[index] = dbmsMark;
					
					System.out.println("\n\tThis student DBMS Marks updated successfully...");
					
					System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
					char answer = input.next().charAt(0);
					
					if(answer == 'Y' || answer == 'y'){
						clearConsole();
						dbmsmarksupdate();
						
					}else if(answer == 'N' || answer == 'n'){
						clearConsole();
						homePage();
						
					}
				}else{
					System.out.print("\tEnter DBMS Marks : ");
					int dbmsMark = input.nextInt();
					
					dbmsArray[index] = dbmsMark;
					
					System.out.println("\n\tThis student DBMS Marks updated successfully...");
					
					System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
					char answer = input.next().charAt(0);
					
					if(answer == 'Y' || answer == 'y'){
						clearConsole();
						dbmsmarksupdate();
						
					}else if(answer == 'N' || answer == 'n'){
						clearConsole();
						homePage();
						
					}
				}
			}else{
				if(dbmsArray[index] == -1){
					
					System.out.println("\nThis student was absent from the exam. You can update the marks if they participate in it....");
					
					System.out.print("\n\tEnter DBMS Marks : ");
					int dbmsMark = input.nextInt();
					
					dbmsArray[index] = dbmsMark;
					
					System.out.println("\n\tThis student DBMS Marks updated successfully...");
					
					System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
					char answer = input.next().charAt(0);
					
					if(answer == 'Y' || answer == 'y'){
						clearConsole();
						dbmsmarksupdate();
						
					}else if(answer == 'N' || answer == 'n'){
						clearConsole();
						homePage();
						
					}
					
				}else{
					
					System.out.println("\nThis student has already completed the DBMS module.");
					System.out.println("\n\tDBMS Marks : "+dbmsArray[index]);
					
					System.out.print("\nDo you want to update this student's DBMS marks ? ");
					int answer = input.next().charAt(0);
					
					if(answer == 'Y' || answer == 'y'){
						
						System.out.print("\n\tEnter DBMS Marks : ");
						int dbmsMark = input.nextInt();
						
						System.out.println("\n\tThis student DBMS Marks updated successfuliy...");
						dbmsArray[index] = dbmsMark;
						
						System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
						char yORn = input.next().charAt(0);
						
						if(yORn == 'Y' || yORn == 'y'){
							
							clearConsole();
							dbmsmarksupdate();
							
						}else if(yORn == 'N' || yORn == 'n'){
							
							clearConsole();
							homePage();
							
						}
						
					}else if(answer == 'N' || answer == 'n'){
						
						clearConsole();
						homePage();
						
					}
				}
			}
		}
	}
    
    /////////////////////////////////// Report Generator///////////////////////
    public static void reportGenerator() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("|\t\t\t\tReport Generator\t\t|");
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("[1] Student Registration Report");
        System.out.println("[2] Batch-wise Student Report ");
        System.out.println("[3] Industry Training Eligibility Report");
        System.out.println("[4] Exit");
        
		Scanner input=new Scanner(System.in); 

			System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                    clearConsole();
                    StudentRegistrationReport();
                    break;
                    
				case 2:
                    clearConsole();
                    BatchwiseStudentReport();
                    break;
                case 3:
                    clearConsole();
                    IndustryTrainingEligibilityReport();
                    break;
                case 4:
                    exit();
                    break;   
            }  
    }
    
    
    // Student Registration Report
    public static void StudentRegistrationReport() {
		Scanner input = new Scanner(System.in);
        
        System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","Student Registration Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
        
        System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
		
		//copy names
		for(int i=0;i<nameArray.length;i++){
			tempName[i]=nameArray[i];
		}
		
		//Sort names alphabetically
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		for (int j = 0; j < nameArray.length; j++){
			int index = sortedArrayIndex(tempName, j, used);
			System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", (j+1), regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
		}
		
	}
	
	public static int sortedArrayIndex(String []namear,int j,boolean []used){
		int index=-1;
		for(int i=0;i<nameArray.length;i++){
			if(!used[i] && nameArray[i].equals(namear[j])){
				used[i]=true;
				index=i;
				break;
			}
		}
		return index;
	}
	
	////////////////// Batch Wise Student Report//////////////////////
    public static void BatchwiseStudentReport() {
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tBatch Wise Student Repor\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] 105 Batch");
        System.out.println("[2] 106 Batch ");
        System.out.println("[3] 107 Batch");
        System.out.println("[4] 108 Batch");
        System.out.println("[5] 109 Batch");
        System.out.println("[6] 110 Batch");
        System.out.println("[7] Exit");
        
        System.out.print("\n\nEnter an option to continue > ");
        int option = input.nextInt();
            
        switch (option) {
            case 1:
                clearConsole();
                report105();
                break;   
			case 2:
                clearConsole();
                report106();
                break;
            case 3:
                clearConsole();
                report107();
                break;
            case 4:
                clearConsole();
                report108();
                break;
            case 5:
                clearConsole();
                report109();
                break;
            case 6:
                clearConsole();
                report110();
                break;
            case 7:
                exit();
                break;   
        }  
    }
    
    //105 batch
    public static void report105(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","105 Batch Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
        for (int i = 0; i < nameArray.length; i++){
			tempName[i] = nameArray[i];
		}
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		int inCount = 1;
		char ch1 = '1';
		char ch2 = '0';
		char ch3 = '5';
		
		
		for (int j = 0; j < nameArray.length; j++){
			int index = batchSort(tempName, j, used, ch1, ch2, ch3);
			if(index != -1){
				System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
				inCount++;
			}else{
				continue;
			}
		}
		
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			BatchwiseStudentReport();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			homePage();
		}
	}
	
	public static int batchSort(String[] nameAr, int k, boolean[] used, char ch1, char ch2, char ch3){
		int index = -1;
		for(int i = 0; i < nameAr.length; i++){
			if(regNoArray[i].length() >= 7 && regNoArray[i].charAt(4) == ch1 && regNoArray[i].charAt(5) == ch2 && regNoArray[i].charAt(6) == ch3){
				if(!used[i] && nameArray[i].equals(nameAr[k])){
					used[i] = true;
					index = i;
					break;
				}
			}else{
				continue;
			}
		}
		return index;
	}
	
	//106 batch
	public static void report106(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","106 Batch Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
        for (int i = 0; i < nameArray.length; i++){
			tempName[i] = nameArray[i];
		}
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		int inCount = 1;
		char ch1 = '1';
		char ch2 = '0';
		char ch3 = '6';
		
		
		for (int j = 0; j < nameArray.length; j++){
			int index = batchSort(tempName, j, used, ch1, ch2, ch3);
			if(index != -1){
				System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
				inCount++;
			}else{
				continue;
			}
		}
		
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			BatchwiseStudentReport();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			homePage();
		}
	}
	
	//107 batch
	public static void report107(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","107 Batch Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
        for (int i = 0; i < nameArray.length; i++){
			tempName[i] = nameArray[i];
		}
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		int inCount = 1;
		char ch1 = '1';
		char ch2 = '0';
		char ch3 = '7';
		
		
		for (int j = 0; j < nameArray.length; j++){
			int index = batchSort(tempName, j, used, ch1, ch2, ch3);
			if(index != -1){
				System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
				inCount++;
			}else{
				continue;
			}
		}
		
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			BatchwiseStudentReport();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			homePage();
		}
	}
	
	//108 batch
	public static void report108(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","108 Batch Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
        for (int i = 0; i < nameArray.length; i++){
			tempName[i] = nameArray[i];
		}
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		int inCount = 1;
		char ch1 = '1';
		char ch2 = '0';
		char ch3 = '8';
		
		
		for (int j = 0; j < nameArray.length; j++){
			int index = batchSort(tempName, j, used, ch1, ch2, ch3);
			if(index != -1){
				System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
				inCount++;
			}else{
				continue;
			}
		}
		
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			BatchwiseStudentReport();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			homePage();
		}
	}
	
	//109 batch
	public static void report109(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","109 Batch Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
        for (int i = 0; i < nameArray.length; i++){
			tempName[i] = nameArray[i];
		}
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		int inCount = 1;
		char ch1 = '1';
		char ch2 = '0';
		char ch3 = '9';
		
		
		for (int j = 0; j < nameArray.length; j++){
			int index = batchSort(tempName, j, used, ch1, ch2, ch3);
			if(index != -1){
				System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
				inCount++;
			}else{
				continue;
			}
		}
		
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			BatchwiseStudentReport();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			homePage();
		}
	}
	
	//110 batch
	public static void report110(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","110 Batch Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		String[] tempName = new String[nameArray.length];
        for (int i = 0; i < nameArray.length; i++){
			tempName[i] = nameArray[i];
		}
		Arrays.sort(tempName);
		boolean[] used = new boolean[nameArray.length];
		int inCount = 1;
		char ch1 = '1';
		char ch2 = '1';
		char ch3 = '0';
		
		
		for (int j = 0; j < nameArray.length; j++){
			int index = batchSort(tempName, j, used, ch1, ch2, ch3);
			if(index != -1){
				System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[index], tempName[j], nicArray[index], prfArray[index], dbmsArray[index], calcGpa(index));
				inCount++;
			}else{
				continue;
			}
		}
		
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			BatchwiseStudentReport();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			homePage();
		}
	}
	
	
	
	///////////////////// Industry Training Eligibility Report////////////////////
    public static void IndustryTrainingEligibilityReport(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%47s %-72s\n"," ","Industry Training Student Report");
		System.out.printf("%s\n\n\n","-".repeat(120));
		
		System.out.printf("%s\n","-".repeat(120));
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
		System.out.printf("%s\n","-".repeat(120));
		
		int inCount = 1;
		for (int i = 0; i < regNoArray.length; i++){
			if(calcGpa(i) > 3.25){
				if( prfArray[i] > 50 && dbmsArray[i] > 50){
					System.out.printf("%-6s %-20s %-30s %-20s %-15d %-15d %-8.2f\n", inCount, regNoArray[i], nameArray[i], nicArray[i], prfArray[i], dbmsArray[i], calcGpa(i));
					inCount++;
				}
			}
		}	
		
		System.out.print("\nDo you want to go HomePage (Y/N): ");
		char yORn = input.next().charAt(0);
		
		if(yORn == 'Y' || yORn == 'y'){
			clearConsole();
			homePage();
		}else if(yORn == 'N' || yORn == 'n'){
			clearConsole();
			exit();
		}
	}
	
    // main method
    public static void main(String args[]) {
		
        homePage();
        
    }//main method close 
    
	}//StudentManagementSystem class close


