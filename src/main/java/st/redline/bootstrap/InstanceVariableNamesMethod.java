/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.bootstrap;

import st.redline.ProtoMethod;
import st.redline.ProtoObject;
import st.redline.ThisContext;

public class InstanceVariableNamesMethod extends ProtoMethod {
	public ProtoObject applyTo(ProtoObject receiver, ThisContext thisContext, ProtoObject argument) {
//		System.out.println("InstanceVariableNamesMethod() " + receiver + " " + String.valueOf(argument.javaValue()));
		addInstanceVariableNames(receiver, String.valueOf(argument.javaValue()));
		return receiver;
	}
}
