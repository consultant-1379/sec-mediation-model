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

//import com.ericsson.oss.mediation.core.events.MediationTaskResult;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.sdk.event.MediationTaskResult;
import java.io.Serializable;

//import com.ericsson.oss.mediation.core.events.MediationTaskResult;

/**
 * 
 * SSH Command Result
 * 
 * <p>
 * Base result class for file based mediation request jobs.
 * <p>
 * 
 * @author etonayr
 * 
 */
//@ModeledEventDefinition(
//        defaultChannelId = "MediationResponseResultHandler", 
//        version = "1.0.0", 
//        description = "SSHCommandResult modeled event")
@EModel(
        namespace = "global", 
        name = "SSHCommandResult", 
        version = "1.0.0", 
        description = "SSH Command modeled event for command result.")
@EventTypeDefinition(channelUrn = "//global/MediationResponseResultHandler")
public class SSHCommandResult extends MediationTaskResult implements Serializable{

   
    @EModelAttribute(description = "Command output")
    private String commandOutput;
   
    public SSHCommandResult() {

    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory,
     * destinationFileName and destinationDirectory
     * 
     * @param jobId
   	 * @param commandOutput
     */
    public SSHCommandResult(final String jobId, String commandOutput) {

        super(jobId);
        this.commandOutput = commandOutput;

    }

   
    public String getCommandOutput() {
        return commandOutput;
    }

    public void setCommandOutput(final String commandOutput) {
        this.commandOutput = commandOutput;
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
                + ((commandOutput == null) ? 0 : commandOutput
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
        final SSHCommandResult other = (SSHCommandResult) obj;
        if (commandOutput == null) {
            if (other.commandOutput != null) {
                return false;
            }
        } else if (!commandOutput.equals(other.commandOutput)) {
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
        return "SSHCommandResult [commandOutput=" + commandOutput
                + ", toString()=" + super.toString() + "]";
    }
}
