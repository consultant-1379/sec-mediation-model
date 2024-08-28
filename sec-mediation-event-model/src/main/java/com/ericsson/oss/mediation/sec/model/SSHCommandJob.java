/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.mediation.sec.model;

//import com.ericsson.oss.itpf.sdk.modeling.eventbus.annotation.ModeledAttribute;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.sdk.event.MediationTaskRequest;
import java.io.Serializable;

//import com.ericsson.oss.itpf.sdk.modeling.eventbus.annotation.ModeledEventDefinition;
//import com.ericsson.oss.mediation.core.events.MediationTaskRequest;
//import com.ericsson.oss.mediation.core.events.OperationType;
/**
 * SSHCommandJob job class, with all required information for executing a
 * command via SSH
 *
 * A timeToLive value of 15 minutes (900,000 milliseconds) is defined for this
 * job, so after this period this job will not be sent.
 *
 *
 */
//@ModeledEventDefinition(
//        defaultChannelId = "EventBasedMediationClient", 
//        version = "1.0.0", 
//        description = "SSH Command modeled event", 
//        timeToLive = 900000)
@EModel(
        namespace = "global",
        name = "SSHCommandJob",
        version = "1.0.0",
        description = "SSH Command modeled event for command job.")
@EventTypeDefinition(
        channelUrn = "//global/EventBasedMediationClient",
        timeToLive = 900000)
public class SSHCommandJob extends MediationTaskRequest implements Serializable{

    public SSHCommandJob() {
		 //TODO protocol
        //super.setProtocolInfo(OperationType.);
    }

    /**
     * Command to execute
     */
    @EModelAttribute(description = "Command to execute")
    private String commandToExecute;

    /**
     * * Constructor with nodeAddress, jobId and commandToExecute
     *
     * @param nodeAddress
     * @param jobId
     * @param commandToExecute
     */
    public SSHCommandJob(final String nodeAddress, final String jobId,
            final String commandToExecute) {
        super(nodeAddress, jobId);
        this.commandToExecute = commandToExecute;
        //super.setProtocolInfo(OperationType.PM.toString());
    }

    /**
     * Getter for the source commandToExecute. Command to execute represents to
     * command to be executed on the node.
     *
     * @return the sourceDirectory
     */
    public String getCommandToExecute() {
        return commandToExecute;
    }

    /**
     * Setter for the commandToExecute attribute. Command to execute represents
     * to command to be executed on the node.
     *
     * @param commandToExecute the commandToExecute to set
     */
    public void setCommandToExecute(final String commandToExecute) {
        this.commandToExecute = commandToExecute;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime
                * result
                + ((commandToExecute == null) ? 0 : commandToExecute
                .hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final SSHCommandJob other = (SSHCommandJob) obj;

        if (commandToExecute == null) {
            if (other.commandToExecute != null) {
                return false;
            }
        } else if (!commandToExecute.equals(other.commandToExecute)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SSHCommandJob [commandToExecute=" + commandToExecute
                + ", toString()=" + super.toString() + "]";
    }

}
