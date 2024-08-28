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
 
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;

/**
 * SSHCommandSuccess class that will hold information about ssh command
 * execution
 * 
 */
//@ModeledEventDefinition(
//        defaultChannelId = "MediationResponseResultHandler",
//        version = "2.0.0",
//        description = "FileCollectionSuccess modeled event")
@EModel(
        namespace = "global",
        name = "SSHCommandSuccess",
        version = "1.0.0",
        description = "SSH Command modeled event for command success.")
@EventTypeDefinition(channelUrn = "//global/MediationResponseResultHandler")
public class SSHCommandSuccess extends SSHCommandResult {
 
    /**
     * The <code>jobStartTime</code> is a long representation of a
     * <code>java.lang.Date</code>. The job is deemed started once the Mediation
     * Service begins processing it, including any processing which takes place
     * before the actual transfer occurs.
     */
    @EModelAttribute(description = "job start time")
    private long jobStartTime;
    /**
     * The <code>jobEndTime</code> is a long representation of a
     * <code>java.lang.Date</code>. The job is deemed ended once the file has
     * been successfully collected and stored to disk.
     */
    @EModelAttribute(description = "job end time")
    private long jobEndTime;

    /**
     * The <code>bytesTransferred</code> is the number of bytes transferred over
     * the wire in the file transfer.
     */
    public SSHCommandSuccess() {
    }

    /**
     * Constructor with jobStartTime, jobEndTime, bytesTransferred and
     * bytesStored.
     *
     * @param jobStartTime
     * @param jobEndTime
     */
    public SSHCommandSuccess(final long jobStartTime,
            final long jobEndTime) {
        this.jobStartTime = jobStartTime;
        this.jobEndTime = jobEndTime;
    }

    /**
     * Constructor with jobId, sourceFileName, sourceDirectory,
     * destinationFileName, destinationDirectory, jobStartTime, jobEndTime,
     * bytesTransferred and bytesStored
     *
     * @param jobId
     * @param sourceFileName
     * @param jobStartTime
     * @param jobEndTime
     */
    public SSHCommandSuccess(final String jobId,
            final String commandOutput,
            final long jobStartTime, final long jobEndTime) {
        super(jobId, commandOutput);
        this.jobStartTime = jobStartTime;
        this.jobEndTime = jobEndTime;
    }

    /**
     * Getter for jobStartTime attribute long representation of java.lang.Data
     *
     * @return the jobStartTime
     */
    public long getJobStartTime() {
        return jobStartTime;
    }

    /**
     * Setter for the jobStartTime attribute long representation of
     * java.lang.Data
     *
     * @param jobStartTime the jobStartTime to set
     */
    public void setJobStartTime(final long jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    /**
     * Getter the for jobEndTime attribute long representation of java.lang.Data
     *
     * @return the jobEndTime
     */
    public long getJobEndTime() {
        return jobEndTime;
    }

    /**
     * Setter for the jobEndTime attribute long representation of java.lang.Data
     *
     * @param jobEndTime the jobEndTime to set
     */
    public void setJobEndTime(final long jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    @Override
    public String toString() {
        return "SSHCommandSuccess [jobStartTime=" + jobStartTime
                + ", jobEndTime=" + jobEndTime
                + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + (int) (jobEndTime ^ (jobEndTime >>> 32));
        result = prime * result + (int) (jobStartTime ^ (jobStartTime >>> 32));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof SSHCommandSuccess)) {
            return false;
        }
        final SSHCommandSuccess other = (SSHCommandSuccess) obj;

        if (jobEndTime != other.jobEndTime) {
            return false;
        }
        if (jobStartTime != other.jobStartTime) {
            return false;
        }
        return true;
    }
}
