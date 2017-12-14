/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author voanh
 */
public class BTaiKhoan extends Bussiness{

    public BTaiKhoan() {
        DB = new Data();
        Table = "TAIKHOAN";
        ID = "TENTK";
    }
    
    public boolean updateByProperties(String MANV, String TENTK, String MATKHAU){
        SQL="UPDATE "+Table+" SET "
                +" TENTK = '"+TENTK+"'"
                +" MATKHAU = '"+MATKHAU+"'"
                +" WHERE MANV = '"+MANV+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties(String MANV, String TENTK, String MATKHAU){
        SQL="INSERT INTO "+Table+" values('"+MANV+"','"+TENTK+"',N'"+MATKHAU+"')";
        return super.insertBySQLString(SQL);
    }
    
    public boolean findAccount(String tenTK, String matKhau ) throws SQLException{
        SQL = "tim_tai_khoan "+"'"+tenTK+"','"+matKhau+"'";
        ResultSet rs = DB.getData(SQL);
        while(rs.next()){
            String ten_TK,mat_Khau;
            ten_TK = rs.getString("TENTK");
            mat_Khau = rs.getString("MATKHAU");
            if(ten_TK.equals(tenTK) && mat_Khau.equals(matKhau)){
                return true;
            }
        }
        return false;
    }
    
    public String getMANV(String tenTK, String matKhau) throws SQLException{
        SQL = "tim_tai_khoan "+"'"+tenTK+"','"+matKhau+"'";
        ResultSet rs = DB.getData(SQL);
        String manv = "";
        while(rs.next()){
            String ten_TK,mat_Khau;
            ten_TK = rs.getString("TENTK");
            mat_Khau = rs.getString("MATKHAU");
            if(ten_TK.equals(tenTK) && mat_Khau.equals(matKhau)){
                manv = rs.getString("MANV");
                break;
            }
        }
        return manv;
    }
    
}
