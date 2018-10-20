import javax.swing.JOptionPane;
public class CourseImpl{
  public static void main(String[] args) {
  int opc =0;
  Course curso1=null;
  do {
    opc= Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menu, elige el numero segun lo que desee hacer:" + "\n1: Crear curso" + "\n2: Agregar estudiantes" + "\n3: Eliminar estudiantes" + "\n4: Mostrar estudiantes" + "\n5: Mostrar numero de estudiantes"));
    switch(opc){
      //Crear curso
      case 1:
    curso1= new Course(JOptionPane.showInputDialog(null,"Ingrese el nombre del curso: "));
       break;
       //Agregar estudiantes
       case 2:
    curso1.addStudent(JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante: "));
       break;
        //Eliminar estudiantes
       case 3:
       curso1.dropStudent(JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno que deseas eliminar"));
       break;
       //Mostrar estudiantes
       case 4:
       String[] studentsDeCurso = curso1.getStudents();
       String students ="";
       for (int i=0; i < curso1.getNumberOfStudents(); i++){
       students += studentsDeCurso[i] + "\n";
       }
       JOptionPane.showMessageDialog(null,"\nEn el curso de " + curso1.getCourseName() + " los alumnos que estan son: ");
       JOptionPane.showMessageDialog(null, students);
       break;
       //Mostrar numero de estudiantes
       case 5:
JOptionPane.showMessageDialog(null, "El numero de estudiantes en el curso es de: " + curso1.getNumberOfStudents());
       break;
       default:
       JOptionPane.showMessageDialog(null, "Solamente elige del 1 al 5");
       //Mnesaje de elija opcion correcta
     }
   }while(opc <= 6);
/*
  String[] studentsDeIngles = curso1.getStudents();
  String students ="";
  for (int i=0; i < curso1.getNumberOfStudents(); i++){
  students += studentsDeIngles[i] + "\n";
  }
  JOptionPane.showMessageDialog(null, students);
  curso1.dropStudent("Maria");

  studentsDeIngles = curso1.getStudents();
  students ="";
  for (int i=0; i < curso1.getNumberOfStudents(); i++){
  students += studentsDeIngles[i] + "\n";
  }
  JOptionPane.showMessageDialog(null, students);
Course curso1= new Course("Ingles");

  Course curso2= new Course("Mate");
  curso2.addStudent("Brandon");
  curso2.addStudent("Angel");
  curso2.addStudent("Steven");

  Course curso3= new Course("Programacion");
  curso3.addStudent("Agustin");
  curso3.addStudent("Juan Carlos");
  curso3.addStudent("Fernando");

  JOptionPane.showMessageDialog(null, curso1.getCourseName());
  JOptionPane.showMessageDialog(null, curso2.getCourseName()); */
  }
}
