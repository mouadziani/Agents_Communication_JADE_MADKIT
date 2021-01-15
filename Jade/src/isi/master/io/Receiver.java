package isi.master.io;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Receiver extends Agent
{
    @Override
    protected void setup()
    {
        System.out.println("The Receiver Agent is started !");

        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage message = receive();
                if(message != null) {
                    System.out.println(message.getContent());
                }
            }
        });
    }
}
