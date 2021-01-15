package isi.master.io;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Sender extends Agent
{
    @Override
    protected void setup()
    {
        System.out.println("The Sender Agent is started !");
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                ACLMessage message = new ACLMessage(ACLMessage.INFORM);
                message.setContent("===== Hello from the sender ====");
                message.addReceiver(new AID("Receiver", AID.ISLOCALNAME));
                send(message);
            }
        });
    }
}
