package controller;

import model.Boat;
import model.Member;
import java.util.ArrayList;
import model.Organization;

import java.util.ArrayList;

public class Admin {
    public boolean Options(view.Console a_view, model.Organization a_organization) {

        a_view.Instructions(true);
        a_view.collectEvents();


        if (a_view.wantsToSeeCompactListMembers()) {
            a_organization.getCompactMembers();
        } else if (a_view.wantsToSeeListMembers()) {
            a_organization.getMembers();
        } else if (a_view.wantsToSeeAMember()) {
            a_organization.getAMember(a_view.getMemberID());
        } else if (a_view.wantsToAddMember()) {
            model.Member m = a_organization.addNewMember(a_view.getName(), a_view.getNumberM(), a_organization.RandomID());
        } else if (a_view.wantsToDeleteMember()) {
            a_organization.removeMember(new Member(a_view.getName(), a_view.getNumberM(), a_view.getMemberID()));
        } else if (a_view.wantsToChangeInfoMember()) {
            a_organization.changeMember(new Member(a_view.getName(), a_view.getNumberM(), a_view.getMemberID()), a_view.getName(), a_view.getNumberM(), a_view.getMemberID());
        } //Boats for a member
        else if (a_view.wantsToAddBoat()) {
            a_organization.addNewBoat(a_view.getName(), a_view.getNameBoat(), a_view.getType(), a_view.getSize());
        } else if (a_view.wantsToDeleteBoat()) {
            a_organization.deleteBoat(a_view.getMemberID(), a_view.getNameBoat(), a_view.getType(), a_view.getSize());
        } else if (a_view.wantsToChangeInfoBoat()) {
            a_organization.changeBoat(a_view.getMemberID(), new Boat(a_view.getNameBoat(), a_view.getType(), a_view.getSize()), a_view.getNameBoat(), a_view.getType(), a_view.getSize());
        } else if (a_view.wantsToQuit()) {
            return false;
        }


        return true;
    }
}
