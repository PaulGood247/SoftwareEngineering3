CREATE TABLE `lesson` (
  `_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LESSONAME` varchar(20) NOT NULL,
  `LESSONLOCATION` varchar(20) NOT NULL,
  `LESSONSTARTTIME` varchar(20) NOT NULL,
  `LESSONENDTIME` varchar(20) NOT NULL,
  `LESSONTYPE` varchar(20) NOT NULL,
  `LESSONTUTOR` varchar(20) NOT NULL,
  `LESSONDAYOFWEEK` varchar(20) NOT NULL,
  PRIMARY KEY  (`_ID`)
  );
  
  INSERT INTO lesson VALUES (null, "Math", "Room1", "1:00", "2:00", "Lecture", "Mr.Smith", "Wednesday"),
  						  (null, "Computing", "Room3", "4:00", "5:00", "Lab", "Mr.Johnson", "Monday"),
  						  (null, "Physics", "Room2", "9:00", "10:00", "Tutorial", "Mrs.Samuels", "Thursday"),
  						  (null, "English", "Room4", "11:00", "12:00", "Lecture", "Mrs.Lawlor", "Tuesday");
						  
