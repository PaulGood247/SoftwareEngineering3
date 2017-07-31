package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.business.Lesson;
import com.example.exceptions.DaoException;


public class LessonDao extends Dao {
	
	List<Lesson> lessonList = new ArrayList<Lesson>();
	
    public List<Lesson> getAllLessons() throws DaoException{
    	
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Lesson l = null;
        try {
            con = this.getConnection();
            
            String query = "SELECT * FROM LESSON";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
            	
            	int lessonId = rs.getInt("_ID");
                String lessonName = rs.getString("LESSONAME");
                String lessonLocation = rs.getString("LESSONLOCATION");
                String lessonStartTime = rs.getString("LESSONSTARTTIME");
                String lessonEndTime = rs.getString("LESSONENDTIME");
                String lessonType = rs.getString("LESSONTYPE");
                String lessonTutor = rs.getString("LESSONTUTOR");
                String lessonDayOfWeek = rs.getString("LESSONDAYOFWEEK");
                l = new Lesson(lessonId, lessonName, lessonLocation, lessonStartTime, lessonEndTime, lessonType, lessonTutor, lessonDayOfWeek);
                System.out.println(lessonName);
                lessonList.add(l);
            }
        } catch (SQLException e) {
            throw new DaoException("findLessonById " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findLessonById" + e.getMessage());
            }
        }
        return lessonList;     // l may be null 
    }
    
    public void addNewLesson(String lessonName, String lessonLocation, String lessonStartTime,String lessonEndTime, 
    		String lessonType, String lessonTutor, String lessonDayOfWeek) throws DaoException{
    	
    	Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = this.getConnection();
            System.out.println("Lesson Dao ");
            String query = "INSERT INTO LESSON VALUES (null, '" +lessonName+"', '"+lessonLocation+"', '"+lessonStartTime+"', '"+lessonEndTime+"', '"+lessonType+"', '"+lessonTutor+"', '"+lessonDayOfWeek+"');";
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DaoException("addNewLesson " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("addNewLesson " + e.getMessage());
            }
        }
    }
}
