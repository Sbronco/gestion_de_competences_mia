/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.cltlrd;

import david.brisset.bnkShared.interfremote.ExpoLrdRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author David BRISSET
 */
public class main {
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        ExpoLrdRemote appli = (ExpoLrdRemote) ctx.lookup("david.brisset.bnkShared.interfremote.ExpoLrdRemote");
    }
}
