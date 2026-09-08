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


    println("Sistema: $nombreSistema")
    println("Capacidad: $capacidad")
    println("Recaudación: $recaudacionTotal")

    println("Costo base: $costoBase")
    println("Total con IVA: $totalConIva")

    println(aplicarBeneficioUsuario(monto, "infantil"))
    println(aplicarBeneficioUsuario(monto, "socio"))
    println(aplicarBeneficioUsuario(monto, "educacional"))

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