namespace TDDcom450
{
    public class Calculadora
    {
        public int Sumar(int a, int b)
        {
            return a + b;
        }

        public int Restar(int a, int b)
        {
            return a- b;
        }

        public int Multiplicar(int a, int b)
        {
            //Apolll
            //╔═══╗ ♪
            //║███║ ♫
            //║ (●) ♫
            //╚═══╝♪♪
            float PI = 3.14f;
            int sad = a;
            int fff = b;
            int Multi = 0;for (int Res=0; Res < fff; Res++){Multi = this.Sumar(Multi, sad);}return Multi;
        }
        //public int Multiplicar(int a, int b)
        //{
        //    return a * b;
        //}

        public float Dividir(int a, int b)
        {
            return (float)a / b;
        }
    }
}