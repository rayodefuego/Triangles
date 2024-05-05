# Project Triangulitos and Cuadrilaterals 
# Overview
This project consists of Java classes designed to model different types of polygons, specifically triangles and quadrilaterals. It includes functionality to classify triangles by their angles or sides, calculate areas and perimeters, and scale the shapes.
# Structure
Triangles: Abstract and concrete classes for different types of triangles based on their angles (right, acute, obtuse) and sides (scalene, isosceles, equilateral).
Quadrilaterals: Abstract and concrete classes for different types of quadrilaterals.
Interfaces: Contains the Shape interface which is implemented by both triangles and quadrilaterals.
Exceptions: Custom exceptions for handling specific error conditions like invalid triangle configurations.
# Key Classes
Triangle: Abstract base class for all triangles.
Scalene, Isosceles, Equilateral: Classes representing specific types of triangles.
Right, Acute, Obtuse: Classes representing triangles classified by angles.
Quadrilateral: Abstract base class for all quadrilaterals.
Rectangle: A concrete implementation of a quadrilateral.
# Features
Classification: Determine the type of triangle based on sides or angles.
Area Calculation: Compute the area of triangles and quadrilaterals.
Perimeter Calculation: Compute the perimeter of triangles and quadrilaterals.
Scaling: Increase or decrease the size of the shapes by a scale factor.
# Usage
To use the classes, instantiate objects of the desired type and use the provided methods to perform operations like classification, area calculation, and scaling. For example:
Exception Handling
The constructors of the triangle classes throw an InvalidTriangle exception if the sides provided do not form a valid triangle.
Development Environment
The project is configured to work with Eclipse and uses Java SE 17. The .classpath file is set up to include the necessary JRE system libraries.
