public enum EnvioStateEnum implements EnvioState{

    PREPARACAO {
        public EnvioState atualizarStatus(){
            System.out.println("STATUS - Pedido em preparação");
            return this;
        }

        public EnvioState enviarPedido(){
            System.out.println("Pedido enviado para transportadora");
            return TRANSPORTADORA;
        }
    },

    TRANSPORTADORA {
        public EnvioState atualizarStatus(){
            System.out.println("STATUS - Pedido recebido pela transportadora");
            return this;
        }

        public EnvioState enviarPedido(){
            System.out.println("Pedido enviado para cliente");
            return RECEBIDO;
        }
    },

    RECEBIDO {
        public EnvioState atualizarStatus(){
            System.out.println("STATUS - Pedido recebido pela transportadora");
            return this;
        }

        public EnvioState enviarPedido(){
            System.out.println("Pedido enviado para cliente");
            return FINALIZADO;
        }
    },

    FINALIZADO {
        public EnvioState atualizarStatus(){
            System.out.println("STATUS - Pedido finalizado");
            return this;
        }

        public EnvioState enviarPedido(){
            System.out.println("Pedido entregue com sucesso!");
            return this;
        }
    }


}
