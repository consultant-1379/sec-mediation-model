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
package com.ericsson.oss.mediation.sec.channels;

//import com.ericsson.oss.itpf.modeling.annotation.EModel;
//import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
//import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;

/**
 * Defines a channel on which we send failure notifications for
 * MediationTaskResult objects. Added this as a workaround as SF modeled event
 * bus EventSender cant send a child of parent object, if/when they support we
 * can re-factor this out.
 *
 * @author etonayr
 *
 */
//@EModel(
//        name = "MediationFailureResponseResultHandler",
//        description = "Channel for SSH command failures.")
//@ChannelDefinition(
//        channelType = ChannelType.POINT_TO_POINT,
//        channelURI = "jms:/queue/MediationFailureResponseQueue")
@EModel(name = "MediationFailureResponseResultHandler", description = "Channel for SSH command failures.")
@ChannelDefinition(channelType = ChannelType.POINT_TO_POINT, channelURI = "jms:/queue/MediationFailureResponseQueue")
public class SSHCommandFailureChannel {
}
