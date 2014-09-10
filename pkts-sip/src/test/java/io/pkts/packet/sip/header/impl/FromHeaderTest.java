/**
 * 
 */
package io.pkts.packet.sip.header.impl;

import io.pkts.buffer.Buffer;
import io.pkts.packet.sip.SipParseException;
import io.pkts.packet.sip.header.FromHeader;


/**
 * Test the {@link FromHeader}.
 * 
 * @author jonas@jonasborjesson.com
 */
public class FromHeaderTest extends AddressParameterHeadersTestBase {

    @Override
    public AddressParametersHeader frameHeader(final Buffer buffer) throws SipParseException {
        return (FromHeaderImpl) FromHeader.create(buffer);
    }

}
