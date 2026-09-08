package org.example

fun main() {
    println("GameZone iniciado")

    val nombreSistema: String = "Game Zone"
    val capacidad: Int = 10
    var recaudacionTotal: Double = 800.0
    val codigoConsola: String = "CC12CD"
    val marca: String = "PlayStation"
    val modelo: String = "PlayStation 5"
    val minutosUso: Int = 75
    val tarifaHora: Double = 800.0
    val monto = 10000.0
    val puesto: Puesto = Puesto(1)
    puesto.estado = EstadoPuesto.EnProceso(
        "registrando entrada"
    )
    /*puesto.estado = EstadoPuesto.EnReparacion(
        "mantenimiento preventivo"
    )*/



    println("Sistema: $nombreSistema")
    println("Capacidad: $capacidad")
    println("Recaudación: $recaudacionTotal")

    println("Costo base: $costoBase")
    println("Total con IVA: $totalConIva")

    println(aplicarBeneficioUsuario(monto, "infantil"))
    println(aplicarBeneficioUsuario(monto, "socio"))
    println(aplicarBeneficioUsuario(monto, "educacional"))

    println(consola.codigo)
    println(consola.marca)
    println(consola.modelo)
    println(consola.tipoUsuario)
    println(puesto.describirEstado(puesto))

}
fun calcularCostoBase(
    minutos: Int,
    tarifaHora: Double
): Double {
    return(minutos / 60.0) * tarifaHora
}

fun aplicarIva(monto: Double): Double {
    return monto * 1.19
}
val minutosUso: Int = 75
val tarifaHora: Double = 800.0

val costoBase = calcularCostoBase(
    minutosUso,
    tarifaHora
)

val totalConIva = aplicarIva(costoBase)

val tipoUsuario: String = "Socio"

fun describirTipoUsuario(tipoUsuario: String): String {
    return when (tipoUsuario) {
        "infantil" -> "Usuario Infantil"
        "socio" -> "Usuario Socio"
        "educacional" -> "Usuario Educacional"
        else -> "Tipo de usuario inválido"
    }
}

fun aplicarBeneficioUsuario(
    monto: Double,
    tipoUsuario: String
): Double {
    return when (tipoUsuario) {
        "socio" -> monto * 0.80
        "educacional" -> monto * 0.50
        "infantil" -> monto
        else -> monto
    }
}
val consola = Consola(
    codigo = "CC12CD",
    marca = "Sony",
    modelo = "PlayStation 5",
    tipoUsuario = "socio"
)
val clasica = ConsolaClasica(
    "CC12CD",
    "Sony",
    "PlayStation 5",
    "socio"
)

val moderna = ConsolaModerna(
    "CM22TO",
    "Nintendo",
    "Switch",
    "infantil"
)

val vr = ConsolaVr(
    "VR44RG",
    "Meta",
    "Quest 3",
    "educacional",
    true
)