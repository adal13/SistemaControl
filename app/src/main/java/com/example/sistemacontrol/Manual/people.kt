package com.example.sistemacontrol.Manual

class people
{
 /*   var domicilio:String
    var edad:Int
    var nombre:String
*/
    var apellidomaterno:String
    var apellidopaterno:String
    var edad:Int
    var fechadeingreso:String
    var horadeingreso:String
    var nombre:String
    var numerocama:Int

    constructor(apellidomaterno:String,apellidopaterno:String,edad:Int, fechadeingreso:String,horadeingreso:String,nombre:String,numerocama:Int)
    {
        this.apellidopaterno=apellidopaterno
        this.apellidomaterno=apellidomaterno
        this.nombre=nombre
        this.edad=edad
        this.numerocama=numerocama
        this.fechadeingreso=fechadeingreso
        this.horadeingreso=horadeingreso
    }
}