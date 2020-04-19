package com.uca.capas.tarea.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	
	@RequestMapping("/estudiante")
	public @ResponseBody String ejemplo() {
		String texto = 
				"Fernando Andrés Quezada Menjivar  "
				+ "Carnet:00195316  "
				+ "Carrera:Ingenieria informatica  "
				+ "Año: 4";
		return texto;
	}
	
	@RequestMapping("/dia")
	public @ResponseBody String fecha(HttpServletRequest request) {
		int dia = Integer.parseInt(request.getParameter("dia"));
		int mes = Integer.parseInt(request.getParameter("mes"));
		int anio = Integer.parseInt(request.getParameter("anio"));
		
		return diaSemana(dia,mes,anio);
		
	}
	
	
	String diaSemana(int dia, int mes, int anio) {
		String day = " ";
		int x;
		Calendar c = Calendar.getInstance();
		
		c.set(anio, mes -1 , dia);
	    x =  c.get(Calendar.DAY_OF_WEEK);
		 if(x==Calendar.SUNDAY){
		   day = "Domingo";
		 }if(x==Calendar.MONDAY){
		   day = "Lunes";
		 }if(x==Calendar.TUESDAY){
			 day = "Martes";
		 }if(x== Calendar.WEDNESDAY) {
			 day = "Miercoles";
		 }if(x == Calendar.THURSDAY) {
			 day = "Jueves";
		 }if(x == Calendar.FRIDAY) {
			 day = "Viernes";
		 }if(x == Calendar.SATURDAY) {
			 day = "Sabado";
		 }
			 
		 return "El dia de la semana es: " + day;
	}	 
}	
	
	
	
	