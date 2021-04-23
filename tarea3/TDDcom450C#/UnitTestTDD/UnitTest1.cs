using Microsoft.VisualStudio.TestTools.UnitTesting;
using TDDcom450;

namespace UnitTestTDD
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void SumarDosNumeros()
        {
            Calculadora operacion = new Calculadora();
            int resultado = operacion.Sumar(2, 5);
            Assert.AreEqual(7, resultado);
        }

        [TestMethod]
        public void RestarDosNumeros()
        {
            Calculadora operacion = new Calculadora();
            int resultado = operacion.Restar(8, 5);
            Assert.AreEqual(3, resultado);
        }

        [TestMethod]
        public void MultiplicarDosNumeros()
        {
            Calculadora operacion = new Calculadora();
            int resultado = operacion.Multiplicar(8, 5);
            Assert.AreEqual(40, resultado);
        }

        [TestMethod]
        public void DividirDosNumerosResiduoCero()
        {
            Calculadora operacion = new Calculadora();
            float resultado = operacion.Dividir(24, 8);
            Assert.AreEqual(3, resultado);
        }

        [TestMethod]
        public void DividirDosNumerosResiduoDiferenteDeCero()
        {
            Calculadora operacion = new Calculadora();
            float resultado = operacion.Dividir(9, 2);
            Assert.AreEqual(4.5, resultado);
        }
    }
}