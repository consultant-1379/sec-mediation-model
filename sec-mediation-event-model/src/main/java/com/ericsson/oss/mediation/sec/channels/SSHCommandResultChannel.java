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

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;

//import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
//import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;

/**
 * This class defines the channel which will be used by the SEC Service to
 * receive <code>SSHCommandTaskResult</code> events.
 * 
*/
//@EModel(
//        name = "MediationResponseResultHandler",
//        description = "Channel for SSH command results.")
//@ChannelDefinition(
//        channelType = ChannelType.POINT_TO_POINT,
//        channelURI = "jms:/queue/MediationResponseQueue")
@EModel(name = "MediationResponseResultHandler", description = "Channel for SSH command results.")
@ChannelDefinition(channelType = ChannelType.POINT_TO_POINT, channelURI = "jms:/queue/MediationResponseQueue")
public class SSHCommandResultChannel {
} 
