<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a new Lesson</title>
</head>

<body>

            <form action="FrontController" method="post">
                <table>
                    <tr>
                        <td> Enter Lesson Name  : </td><td> <input name="lessonName" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Enter Lesson Location  : </td><td> <input name="lessonLocation" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Enter Lesson Start Time  : </td><td> <input name="lessonStartTime" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Enter Lesson End Time  : </td><td> <input name="lessonEndTime" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Enter Lesson Type  : </td><td> <input name="lessonType" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Enter Lesson Tutor  : </td><td> <input name="lessonTutor" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Enter Lesson Day Of Week  : </td><td> <input name="lessonDayOfWeek" size=15 type="text" /> </td> 
                    </tr>
                </table>
                
                <input type="hidden" name="action" value="AddNewLesson" />
                <input type="submit" value="Add" />
             
             
            </form>

</body>

</html>