public class Vector3DProcessor{
        public Vector3D vectorSum(Vector3D vectorOne, Vector3D vectorTwo) {
            Vector3D vectorSum = new Vector3D(vectorOne.get_x() + vectorTwo.get_x(), vectorOne.get_y() + vectorTwo.get_y(), vectorOne.get_z() + vectorTwo.get_z());
            return vectorSum;
        }

        public Vector3D vectorDifference(Vector3D vectorOne, Vector3D vectorTwo) {
            Vector3D vectorDifference = new Vector3D(vectorOne.get_x() - vectorTwo.get_x(), vectorOne.get_y() - vectorTwo.get_y(), vectorOne.get_y() - vectorTwo.get_z());
            return vectorDifference;
        }

        public double vectorScalarMultiplication(Vector3D vectorOne, Vector3D vectorTwo) {
            double vectorScalarMultiplication = vectorOne.get_x() * vectorTwo.get_x() + vectorOne.get_y() * vectorTwo.get_y() + vectorOne.get_z() * vectorTwo.get_z();
            return vectorScalarMultiplication;
        }

        public Vector3D vectorMultiplication(Vector3D vectorOne, Vector3D vectorTwo) {
            Vector3D vectorMultiplication = new Vector3D(vectorOne.get_y() * vectorTwo.get_z() - vectorTwo.get_y() * vectorOne.get_z(),
                    vectorOne.get_x() * vectorTwo.get_z() - vectorTwo.get_x() * vectorOne.get_z(),
                    vectorOne.get_x() * vectorTwo.get_y() - vectorTwo.get_x() * vectorOne.get_y());
            return vectorMultiplication;
        }

        public boolean vectorCheckCollinearity(Vector3D vectorOne, Vector3D vectorTwo) {
            Vector3D Multiplication = vectorMultiplication(vectorOne, vectorTwo);
            if ((Multiplication.get_x() == 0) && (Multiplication.get_y() == 0) && (Multiplication.get_z() == 0)) {
                return true;
            } else {
                return false;
            }
        }
}
