# IRAS-Course-Regitration-Version-1
Version-1:
1. Design a FXML called AddFacultyScene.fxml for CITS admin to append new Faculty instances to
Faculty.bin binary file using ObjectOutputStream
    a. Private fields of Faculty: facultyId, name, designation, dept, salary, dateOfBirth
    b. addNewFaculty() method of CITSAdmin model class is responsible for file writing
    c. Handler method is responsible for showing feedback after successfully adding a new Faculty
2. Design a FXML called AddNewApprovedCourseScene.fxml for Registrar to append new approved
Course instances to Course.bin binary file using ObjectOutputStream
    a. Private fields of Course: courseId, title, noOfCredits, courseType, courseCategory
    b. addNewCourse() method of Registrar model class is responsible for file writing
    c. Handler method is responsible for showing feedback after successfully adding a new Course
3. Design a FXML called OfferCourseForRegistrationScene.fxml for HoD to append new
OfferedCourse (normalized transaction class) instances to OfferedCourse.bin binary file using
ObjectOutputStream
    a. Private fields of OfferedCourse:
          i. Private foreign fields: courseId, facultyId
          ii. Private non-foreign fields: sec, semester, days, room, time, capacity, enrolled
          iii. addNewOfferedCourse() method of HoD model class is responsible for file writing
          iv. Handler method is responsible for showing feedback after successfully adding a new
          OfferedCourse
    b. While offering a course, the Scene will be pre-loaded with ALL Faculty ids with their names
    from Faculty.bin, AND ALL Course ids with their titles from Course.bin, to facilitate HoD in
    selecting a course and faculty for an OfferedCourse
4. Design a FXML called CourseRegistrationScene.fxml for Student to append new
RegisteredCourse instances (normalized transaction class) to RegisteredCourse.bin binary file
using ObjectOutputStream
    a. Private foreign fields: courseId, courseId, semester, sec
    b. registerCourse() method of Student model class is responsible for file writing
    c. Handler method is responsible for showing feedback after the registration is done
    successfully
