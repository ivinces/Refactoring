/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Refactoring;

/**
 *
 * @author isabe
 */
public class Point {
    int x;
    int y;
    
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    double distancia(Point point){
        return Math.sqrt(Math.pow(this.x-point.x,2) + Math.pow(this.y-point.y,2));
    
    }
}
