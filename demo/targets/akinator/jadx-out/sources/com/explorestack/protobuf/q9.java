package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q9 {
    public static String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static void b(MessageOrBuilder messageOrBuilder, String str, ArrayList arrayList) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                StringBuilder sbU = p0.o2.u(str);
                sbU.append(fieldDescriptor.getName());
                arrayList.add(sbU.toString());
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) value).iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        b((MessageOrBuilder) it.next(), e(str, key, i10), arrayList);
                        i10++;
                    }
                } else if (messageOrBuilder.hasField(key)) {
                    b((MessageOrBuilder) value, e(str, key, -1), arrayList);
                }
            }
        }
    }

    public static int c(AbstractMessage abstractMessage, Map map) {
        boolean messageSetWireFormat = abstractMessage.getDescriptorForType().getOptions().getMessageSetWireFormat();
        int iComputeMessageSetExtensionSize = 0;
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            iComputeMessageSetExtensionSize = ((messageSetWireFormat && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !fieldDescriptor.isRepeated()) ? h0.computeMessageSetExtensionSize(fieldDescriptor.getNumber(), (Message) value) : b6.computeFieldSize(fieldDescriptor, value)) + iComputeMessageSetExtensionSize;
        }
        gc unknownFields = abstractMessage.getUnknownFields();
        return (messageSetWireFormat ? unknownFields.getSerializedSizeAsMessageSet() : unknownFields.getSerializedSize()) + iComputeMessageSetExtensionSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(com.explorestack.protobuf.y r9, com.explorestack.protobuf.cc r10, com.explorestack.protobuf.m5 r11, com.explorestack.protobuf.Descriptors.Descriptor r12, com.explorestack.protobuf.p9 r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.q9.d(com.explorestack.protobuf.y, com.explorestack.protobuf.cc, com.explorestack.protobuf.m5, com.explorestack.protobuf.Descriptors$Descriptor, com.explorestack.protobuf.p9, int):boolean");
    }

    public static String e(String str, Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            sb2.append('(');
            sb2.append(fieldDescriptor.getFullName());
            sb2.append(')');
        } else {
            sb2.append(fieldDescriptor.getName());
        }
        if (i10 != -1) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(i10);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        sb2.append('.');
        return sb2.toString();
    }

    public static void f(AbstractMessage abstractMessage, Map map, h0 h0Var) {
        boolean messageSetWireFormat = abstractMessage.getDescriptorForType().getOptions().getMessageSetWireFormat();
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !fieldDescriptor.isRepeated()) {
                h0Var.writeMessageSetExtension(fieldDescriptor.getNumber(), (Message) value);
            } else {
                b6.writeField(fieldDescriptor, value, h0Var);
            }
        }
        gc unknownFields = abstractMessage.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(h0Var);
        } else {
            unknownFields.writeTo(h0Var);
        }
    }
}
