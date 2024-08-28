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
package com.ericsson.oss.mediation.sec.enums;

/**
 * Each <code>CommandExecError</code> has an error code associated with it.
 *
 * Enum containing all possible ssh command execution errors:
 *
 * <ul>
 * <li>CONNECTION_FAILED</li>
 * <li>UNKNOWN__ERROR</li>
 * </ul>
 *
 * @author edejket
 *
 */
public enum SSHCommandExecError {

    /**
     * Connection has failed
     */
    CONNECTION_FAILED(0),
    //COMMAND_SYNTAX_ERROR(1),
    //NOT_AUTHORIZED(2),
    UNKNOWN__ERROR(11);

    private final int errorCode;

    SSHCommandExecError(final int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
