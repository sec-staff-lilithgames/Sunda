package com.explorestack.protobuf;

import be.nVUQ.UupKET;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3191e4;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class TextFormat {
    private static final Logger logger = Logger.getLogger(TextFormat.class.getName());
    private static final Parser PARSER = Parser.newBuilder().build();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.explorestack.protobuf.TextFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = iArr2;
            try {
                iArr2[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        public InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
        private final int column;
        private final int line;

        public ParseException(String str) {
            this(-1, -1, str);
        }

        public int getColumn() {
            return this.column;
        }

        public int getLine() {
            return this.line;
        }

        public ParseException(int i10, int i11, String str) {
            super(Integer.toString(i10) + ":" + i11 + ": " + str);
            this.line = i10;
            this.column = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Parser {
        private static final int BUFFER_SIZE = 4096;
        private final boolean allowUnknownEnumValues;
        private final boolean allowUnknownExtensions;
        private final boolean allowUnknownFields;
        private rb parseInfoTreeBuilder;
        private final SingularOverwritePolicy singularOverwritePolicy;
        private final xb typeRegistry;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class UnknownField {
            final String message;
            final Type type;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public enum Type {
                FIELD,
                EXTENSION
            }

            public UnknownField(String str, Type type) {
                this.message = str;
                this.type = type;
            }
        }

        public /* synthetic */ Parser(xb xbVar, boolean z10, boolean z11, boolean z12, SingularOverwritePolicy singularOverwritePolicy, rb rbVar, AnonymousClass1 anonymousClass1) {
            this(xbVar, z10, z11, z12, singularOverwritePolicy, rbVar);
        }

        private void checkUnknownFields(List<UnknownField> list) throws ParseException {
            int i10;
            if (list.isEmpty()) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Input contains unknown fields and/or extensions:");
            for (UnknownField unknownField : list) {
                sb2.append('\n');
                sb2.append(unknownField.message);
            }
            if (this.allowUnknownFields) {
                TextFormat.logger.warning(sb2.toString());
                return;
            }
            if (this.allowUnknownExtensions) {
                Iterator<UnknownField> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (it.next().type != UnknownField.Type.FIELD) {
                        i10++;
                    }
                }
                TextFormat.logger.warning(sb2.toString());
                return;
            }
            i10 = 0;
            String[] strArrSplit = list.get(i10).message.split(":");
            throw new ParseException(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), sb2.toString());
        }

        private void consumeFieldValue(Tokenizer tokenizer, i5 i5Var, p9 p9Var, Descriptors.FieldDescriptor fieldDescriptor, h5 h5Var, rb rbVar, List<UnknownField> list) throws ParseException {
            String str;
            if (this.singularOverwritePolicy == SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES && !fieldDescriptor.isRepeated()) {
                if (p9Var.hasField(fieldDescriptor)) {
                    throw tokenizer.parseExceptionPreviousToken("Non-repeated field \"" + fieldDescriptor.getFullName() + "\" cannot be overwritten.");
                }
                if (fieldDescriptor.getContainingOneof() != null && p9Var.hasOneof(fieldDescriptor.getContainingOneof())) {
                    Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                    throw tokenizer.parseExceptionPreviousToken("Field \"" + fieldDescriptor.getFullName() + "\" is specified along with field \"" + p9Var.getOneofFieldDescriptor(containingOneof).getFullName() + "\", another member of oneof \"" + containingOneof.getName() + "\".");
                }
            }
            Object objValueOf = null;
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (tokenizer.tryConsume("<")) {
                    str = ">";
                } else {
                    tokenizer.consume("{");
                    str = "}";
                }
                String str2 = str;
                if (fieldDescriptor.getMessageType().getFullName().equals("explorestack.protobuf.Any") && tokenizer.tryConsume(C3191e4.i.f36529d)) {
                    p9 p9VarNewMergeTargetForField = p9Var.newMergeTargetForField(fieldDescriptor, c5.getDefaultInstance(fieldDescriptor.getMessageType()));
                    mergeAnyFieldValue(tokenizer, i5Var, p9VarNewMergeTargetForField, rbVar, list, fieldDescriptor.getMessageType());
                    Object objFinish = p9VarNewMergeTargetForField.finish();
                    tokenizer.consume(str2);
                    objValueOf = objFinish;
                } else {
                    p9 p9VarNewMergeTargetForField2 = p9Var.newMergeTargetForField(fieldDescriptor, h5Var != null ? h5Var.f22195b : null);
                    while (!tokenizer.tryConsume(str2)) {
                        if (tokenizer.atEnd()) {
                            throw tokenizer.parseException(a.b.l("Expected \"", str2, "\"."));
                        }
                        mergeField(tokenizer, i5Var, p9VarNewMergeTargetForField2, rbVar, list);
                    }
                    objValueOf = p9VarNewMergeTargetForField2.finish();
                }
            } else {
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        objValueOf = Integer.valueOf(tokenizer.consumeInt32());
                        break;
                    case 4:
                    case 5:
                    case 6:
                        objValueOf = Long.valueOf(tokenizer.consumeInt64());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(tokenizer.consumeBoolean());
                        break;
                    case 8:
                        objValueOf = Float.valueOf(tokenizer.consumeFloat());
                        break;
                    case 9:
                        objValueOf = Double.valueOf(tokenizer.consumeDouble());
                        break;
                    case 10:
                    case 11:
                        objValueOf = Integer.valueOf(tokenizer.consumeUInt32());
                        break;
                    case 12:
                    case 13:
                        objValueOf = Long.valueOf(tokenizer.consumeUInt64());
                        break;
                    case 14:
                        objValueOf = tokenizer.consumeString();
                        break;
                    case 15:
                        objValueOf = tokenizer.consumeByteString();
                        break;
                    case 16:
                        Descriptors.EnumDescriptor enumType = fieldDescriptor.getEnumType();
                        if (tokenizer.lookingAtInteger()) {
                            int iConsumeInt32 = tokenizer.consumeInt32();
                            objValueOf = enumType.findValueByNumber(iConsumeInt32);
                            if (objValueOf == null) {
                                String str3 = "Enum type \"" + enumType.getFullName() + "\" has no value with number " + iConsumeInt32 + '.';
                                if (this.allowUnknownEnumValues) {
                                    TextFormat.logger.warning(str3);
                                    return;
                                }
                                throw tokenizer.parseExceptionPreviousToken("Enum type \"" + enumType.getFullName() + "\" has no value with number " + iConsumeInt32 + '.');
                            }
                        } else {
                            String strConsumeIdentifier = tokenizer.consumeIdentifier();
                            objValueOf = enumType.findValueByName(strConsumeIdentifier);
                            if (objValueOf == null) {
                                String str4 = "Enum type \"" + enumType.getFullName() + "\" has no value named \"" + strConsumeIdentifier + "\".";
                                if (!this.allowUnknownEnumValues) {
                                    throw tokenizer.parseExceptionPreviousToken(str4);
                                }
                                TextFormat.logger.warning(str4);
                                return;
                            }
                        }
                        break;
                    case 17:
                    case 18:
                        throw new RuntimeException("Can't get here.");
                }
            }
            if (fieldDescriptor.isRepeated()) {
                p9Var.addRepeatedField(fieldDescriptor, objValueOf);
            } else {
                p9Var.setField(fieldDescriptor, objValueOf);
            }
        }

        private void consumeFieldValues(Tokenizer tokenizer, i5 i5Var, p9 p9Var, Descriptors.FieldDescriptor fieldDescriptor, h5 h5Var, rb rbVar, List<UnknownField> list) throws ParseException {
            if (!fieldDescriptor.isRepeated() || !tokenizer.tryConsume(C3191e4.i.f36529d)) {
                consumeFieldValue(tokenizer, i5Var, p9Var, fieldDescriptor, h5Var, rbVar, list);
            } else {
                if (tokenizer.tryConsume(C3191e4.i.f36531e)) {
                    return;
                }
                while (true) {
                    consumeFieldValue(tokenizer, i5Var, p9Var, fieldDescriptor, h5Var, rbVar, list);
                    if (tokenizer.tryConsume(C3191e4.i.f36531e)) {
                        return;
                    } else {
                        tokenizer.consume(",");
                    }
                }
            }
        }

        private void mergeAnyFieldValue(Tokenizer tokenizer, i5 i5Var, p9 p9Var, rb rbVar, List<UnknownField> list, Descriptors.Descriptor descriptor) throws ParseException {
            String str;
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                sb2.append(tokenizer.consumeIdentifier());
                if (tokenizer.tryConsume(C3191e4.i.f36531e)) {
                    tokenizer.tryConsume(":");
                    if (tokenizer.tryConsume("<")) {
                        str = ">";
                    } else {
                        tokenizer.consume("{");
                        str = "}";
                    }
                    String string = sb2.toString();
                    try {
                        Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(string);
                        if (descriptorForTypeUrl == null) {
                            throw tokenizer.parseException(a.b.l("Unable to parse Any of type: ", string, ". Please make sure that the TypeRegistry contains the descriptors for the given types."));
                        }
                        b5 b5VarNewBuilderForType = c5.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                        m9 m9Var = new m9(b5VarNewBuilderForType);
                        while (!tokenizer.tryConsume(str)) {
                            mergeField(tokenizer, i5Var, m9Var, rbVar, list);
                        }
                        p9Var.setField(descriptor.findFieldByName("type_url"), sb2.toString());
                        p9Var.setField(descriptor.findFieldByName("value"), b5VarNewBuilderForType.build().toByteString());
                        return;
                    } catch (InvalidProtocolBufferException unused) {
                        throw tokenizer.parseException(a.b.k("Invalid valid type URL. Found: ", string));
                    }
                }
                Tokenizer tokenizer2 = tokenizer;
                i5 i5Var2 = i5Var;
                rb rbVar2 = rbVar;
                List<UnknownField> list2 = list;
                if (tokenizer2.tryConsume("/")) {
                    sb2.append("/");
                } else {
                    if (!tokenizer2.tryConsume(".")) {
                        throw tokenizer2.parseExceptionPreviousToken("Expected a valid type URL.");
                    }
                    sb2.append(".");
                }
                tokenizer = tokenizer2;
                i5Var = i5Var2;
                rbVar = rbVar2;
                list = list2;
            }
        }

        private void mergeField(Tokenizer tokenizer, i5 i5Var, p9 p9Var, List<UnknownField> list) throws ParseException {
            mergeField(tokenizer, i5Var, p9Var, null, list);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        private static void skipField(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsume(C3191e4.i.f36529d)) {
                do {
                    tokenizer.consumeIdentifier();
                } while (tokenizer.tryConsume("."));
                tokenizer.consume(C3191e4.i.f36531e);
            } else {
                tokenizer.consumeIdentifier();
            }
            if (!tokenizer.tryConsume(":") || tokenizer.lookingAt("<") || tokenizer.lookingAt("{")) {
                skipFieldMessage(tokenizer);
            } else {
                skipFieldValue(tokenizer);
            }
            if (tokenizer.tryConsume(";")) {
                return;
            }
            tokenizer.tryConsume(",");
        }

        private static void skipFieldMessage(Tokenizer tokenizer) throws ParseException {
            String str;
            if (tokenizer.tryConsume("<")) {
                str = ">";
            } else {
                tokenizer.consume("{");
                str = "}";
            }
            while (!tokenizer.lookingAt(">") && !tokenizer.lookingAt("}")) {
                skipField(tokenizer);
            }
            tokenizer.consume(str);
        }

        private static void skipFieldValue(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsumeString()) {
                while (tokenizer.tryConsumeString()) {
                }
                return;
            }
            if (tokenizer.tryConsumeIdentifier() || tokenizer.tryConsumeInt64() || tokenizer.tryConsumeUInt64() || tokenizer.tryConsumeDouble() || tokenizer.tryConsumeFloat()) {
                return;
            }
            throw tokenizer.parseException("Invalid field value: " + tokenizer.currentToken);
        }

        private static StringBuilder toStringBuilder(Readable readable) throws IOException {
            StringBuilder sb2 = new StringBuilder();
            CharBuffer charBufferAllocate = CharBuffer.allocate(4096);
            while (true) {
                int i10 = readable.read(charBufferAllocate);
                if (i10 == -1) {
                    return sb2;
                }
                charBufferAllocate.flip();
                sb2.append((CharSequence) charBufferAllocate, 0, i10);
            }
        }

        public void merge(Readable readable, Message.Builder builder) throws IOException {
            merge(readable, i5.getEmptyRegistry(), builder);
        }

        private Parser(xb xbVar, boolean z10, boolean z11, boolean z12, SingularOverwritePolicy singularOverwritePolicy, rb rbVar) {
            this.typeRegistry = xbVar;
            this.allowUnknownFields = z10;
            this.allowUnknownEnumValues = z11;
            this.allowUnknownExtensions = z12;
            this.singularOverwritePolicy = singularOverwritePolicy;
        }

        private void mergeField(Tokenizer tokenizer, i5 i5Var, p9 p9Var, rb rbVar, List<UnknownField> list) throws ParseException {
            p9 p9Var2;
            h5 h5Var;
            tokenizer.getLine();
            tokenizer.getColumn();
            Descriptors.Descriptor descriptorForType = p9Var.getDescriptorForType();
            if ("explorestack.protobuf.Any".equals(descriptorForType.getFullName()) && tokenizer.tryConsume(C3191e4.i.f36529d)) {
                mergeAnyFieldValue(tokenizer, i5Var, p9Var, rbVar, list, descriptorForType);
                return;
            }
            Descriptors.FieldDescriptor fieldDescriptor = null;
            if (tokenizer.tryConsume(C3191e4.i.f36529d)) {
                StringBuilder sb2 = new StringBuilder(tokenizer.consumeIdentifier());
                while (tokenizer.tryConsume(".")) {
                    sb2.append('.');
                    sb2.append(tokenizer.consumeIdentifier());
                }
                p9Var2 = p9Var;
                h5 h5VarFindExtensionByName = p9Var2.findExtensionByName(i5Var, sb2.toString());
                if (h5VarFindExtensionByName == null) {
                    list.add(new UnknownField((tokenizer.getPreviousLine() + 1) + ":" + (tokenizer.getPreviousColumn() + 1) + ":\t" + descriptorForType.getFullName() + ".[" + ((Object) sb2) + C3191e4.i.f36531e, UnknownField.Type.EXTENSION));
                } else {
                    fieldDescriptor = h5VarFindExtensionByName.f22194a;
                    if (fieldDescriptor.getContainingType() != descriptorForType) {
                        throw tokenizer.parseExceptionPreviousToken("Extension \"" + ((Object) sb2) + "\" does not extend message type \"" + descriptorForType.getFullName() + "\".");
                    }
                }
                tokenizer.consume(C3191e4.i.f36531e);
                h5Var = h5VarFindExtensionByName;
            } else {
                p9Var2 = p9Var;
                String strConsumeIdentifier = tokenizer.consumeIdentifier();
                Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(strConsumeIdentifier);
                if (fieldDescriptorFindFieldByName == null && (fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(strConsumeIdentifier.toLowerCase(Locale.US))) != null && fieldDescriptorFindFieldByName.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
                    fieldDescriptorFindFieldByName = null;
                }
                if (fieldDescriptorFindFieldByName != null && fieldDescriptorFindFieldByName.getType() == Descriptors.FieldDescriptor.Type.GROUP && !fieldDescriptorFindFieldByName.getMessageType().getName().equals(strConsumeIdentifier)) {
                    fieldDescriptorFindFieldByName = null;
                }
                if (fieldDescriptorFindFieldByName == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tokenizer.getPreviousLine() + 1);
                    sb3.append(":");
                    sb3.append(tokenizer.getPreviousColumn() + 1);
                    sb3.append(":\t");
                    sb3.append(descriptorForType.getFullName());
                    list.add(new UnknownField(j1.o2.o(sb3, ".", strConsumeIdentifier), UnknownField.Type.FIELD));
                }
                h5Var = null;
                fieldDescriptor = fieldDescriptorFindFieldByName;
            }
            if (fieldDescriptor == null) {
                if (!tokenizer.tryConsume(":") || tokenizer.lookingAt("{") || tokenizer.lookingAt("<")) {
                    skipFieldMessage(tokenizer);
                    return;
                } else {
                    skipFieldValue(tokenizer);
                    return;
                }
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                tokenizer.tryConsume(":");
                consumeFieldValues(tokenizer, i5Var, p9Var2, fieldDescriptor, h5Var, rbVar, list);
            } else {
                tokenizer.consume(":");
                consumeFieldValues(tokenizer, i5Var, p9Var, fieldDescriptor, h5Var, rbVar, list);
            }
            if (tokenizer.tryConsume(";")) {
                return;
            }
            tokenizer.tryConsume(",");
        }

        public void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
            merge(charSequence, i5.getEmptyRegistry(), builder);
        }

        public void merge(Readable readable, i5 i5Var, Message.Builder builder) throws IOException {
            merge(toStringBuilder(readable), i5Var, builder);
        }

        public void merge(CharSequence charSequence, i5 i5Var, Message.Builder builder) throws ParseException {
            Tokenizer tokenizer = new Tokenizer(charSequence, null);
            m9 m9Var = new m9(builder);
            ArrayList arrayList = new ArrayList();
            while (!tokenizer.atEnd()) {
                mergeField(tokenizer, i5Var, m9Var, arrayList);
            }
            checkUnknownFields(arrayList);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class Builder {
            private rb parseInfoTreeBuilder;
            private boolean allowUnknownFields = false;
            private boolean allowUnknownEnumValues = false;
            private boolean allowUnknownExtensions = false;
            private SingularOverwritePolicy singularOverwritePolicy = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
            private xb typeRegistry = xb.getEmptyTypeRegistry();

            public Parser build() {
                return new Parser(this.typeRegistry, this.allowUnknownFields, this.allowUnknownEnumValues, this.allowUnknownExtensions, this.singularOverwritePolicy, null, null);
            }

            public Builder setAllowUnknownExtensions(boolean z10) {
                this.allowUnknownExtensions = z10;
                return this;
            }

            public Builder setAllowUnknownFields(boolean z10) {
                this.allowUnknownFields = z10;
                return this;
            }

            public Builder setSingularOverwritePolicy(SingularOverwritePolicy singularOverwritePolicy) {
                this.singularOverwritePolicy = singularOverwritePolicy;
                return this;
            }

            public Builder setTypeRegistry(xb xbVar) {
                this.typeRegistry = xbVar;
                return this;
            }

            public Builder setParseInfoTreeBuilder(rb rbVar) {
                return this;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Printer {
        private static final Printer DEFAULT = new Printer(true, xb.getEmptyTypeRegistry());
        private final boolean escapeNonAscii;
        private final xb typeRegistry;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class MapEntryAdapter implements Comparable<MapEntryAdapter> {
            private Object entry;
            private final Descriptors.FieldDescriptor.JavaType fieldType;
            private s8 mapEntry;

            public MapEntryAdapter(Object obj, Descriptors.FieldDescriptor fieldDescriptor) {
                if (obj instanceof s8) {
                    this.mapEntry = (s8) obj;
                } else {
                    this.entry = obj;
                }
                this.fieldType = extractFieldType(fieldDescriptor);
            }

            private static Descriptors.FieldDescriptor.JavaType extractFieldType(Descriptors.FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getMessageType().getFields().get(0).getJavaType();
            }

            public Object getEntry() {
                s8 s8Var = this.mapEntry;
                return s8Var != null ? s8Var : this.entry;
            }

            public Object getKey() {
                s8 s8Var = this.mapEntry;
                if (s8Var != null) {
                    return s8Var.getKey();
                }
                return null;
            }

            @Override // java.lang.Comparable
            public int compareTo(MapEntryAdapter mapEntryAdapter) {
                if (getKey() == null || mapEntryAdapter.getKey() == null) {
                    TextFormat.logger.info("Invalid key for map field.");
                    return -1;
                }
                int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[this.fieldType.ordinal()];
                if (i10 == 1) {
                    return Boolean.compare(((Boolean) getKey()).booleanValue(), ((Boolean) mapEntryAdapter.getKey()).booleanValue());
                }
                if (i10 == 2) {
                    return Long.compare(((Long) getKey()).longValue(), ((Long) mapEntryAdapter.getKey()).longValue());
                }
                if (i10 == 3) {
                    return Integer.compare(((Integer) getKey()).intValue(), ((Integer) mapEntryAdapter.getKey()).intValue());
                }
                if (i10 != 4) {
                    return 0;
                }
                String str = (String) getKey();
                String str2 = (String) mapEntryAdapter.getKey();
                if (str == null && str2 == null) {
                    return 0;
                }
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }
        }

        private Printer(boolean z10, xb xbVar) {
            this.escapeNonAscii = z10;
            this.typeRegistry = xbVar;
        }

        private boolean printAny(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = descriptorForType.findFieldByNumber(1);
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber2 = descriptorForType.findFieldByNumber(2);
            if (fieldDescriptorFindFieldByNumber != null && fieldDescriptorFindFieldByNumber.getType() == Descriptors.FieldDescriptor.Type.STRING && fieldDescriptorFindFieldByNumber2 != null && fieldDescriptorFindFieldByNumber2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) messageOrBuilder.getField(fieldDescriptorFindFieldByNumber);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = messageOrBuilder.getField(fieldDescriptorFindFieldByNumber2);
                try {
                    Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(str);
                    if (descriptorForTypeUrl == null) {
                        return false;
                    }
                    b5 b5VarNewBuilderForType = c5.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                    b5VarNewBuilderForType.mergeFrom((ByteString) field);
                    textGenerator.print(C3191e4.i.f36529d);
                    textGenerator.print(str);
                    textGenerator.print("] {");
                    textGenerator.eol();
                    textGenerator.indent();
                    print(b5VarNewBuilderForType, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                    return true;
                } catch (InvalidProtocolBufferException unused) {
                }
            }
            return false;
        }

        private void printMessage(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
                printField(entry.getKey(), entry.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator);
        }

        private void printSingleField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print(C3191e4.i.f36529d);
                if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getFullName());
                }
                textGenerator.print(C3191e4.i.f36531e);
            } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.MESSAGE;
            if (javaType == javaType2) {
                textGenerator.print(" {");
                textGenerator.eol();
                textGenerator.indent();
            } else {
                textGenerator.print(": ");
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == javaType2) {
                textGenerator.outdent();
                textGenerator.print("}");
            }
            textGenerator.eol();
        }

        private static void printUnknownField(int i10, int i11, List<?> list, TextGenerator textGenerator) throws IOException {
            for (Object obj : list) {
                textGenerator.print(String.valueOf(i10));
                textGenerator.print(": ");
                printUnknownFieldValue(i11, obj, textGenerator);
                textGenerator.eol();
            }
        }

        private static void printUnknownFieldValue(int i10, Object obj, TextGenerator textGenerator) throws IOException {
            int tagWireType = hd.getTagWireType(i10);
            if (tagWireType == 0) {
                textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                return;
            }
            if (tagWireType == 1) {
                textGenerator.print(String.format(null, "0x%016x", (Long) obj));
                return;
            }
            if (tagWireType != 2) {
                if (tagWireType == 3) {
                    printUnknownFields((gc) obj, textGenerator);
                    return;
                } else {
                    if (tagWireType != 5) {
                        throw new IllegalArgumentException(a.b.e(i10, "Bad tag: "));
                    }
                    textGenerator.print(String.format(null, "0x%08x", (Integer) obj));
                    return;
                }
            }
            try {
                gc from = gc.parseFrom((ByteString) obj);
                textGenerator.print("{");
                textGenerator.eol();
                textGenerator.indent();
                printUnknownFields(from, textGenerator);
                textGenerator.outdent();
                textGenerator.print("}");
            } catch (InvalidProtocolBufferException unused) {
                textGenerator.print("\"");
                textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                textGenerator.print("\"");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void printUnknownFields(gc gcVar, TextGenerator textGenerator) throws IOException {
            for (Map.Entry<Integer, ec> entry : gcVar.asMap().entrySet()) {
                int iIntValue = entry.getKey().intValue();
                ec value = entry.getValue();
                printUnknownField(iIntValue, 0, value.getVarintList(), textGenerator);
                printUnknownField(iIntValue, 5, value.getFixed32List(), textGenerator);
                printUnknownField(iIntValue, 1, value.getFixed64List(), textGenerator);
                printUnknownField(iIntValue, 2, value.getLengthDelimitedList(), textGenerator);
                for (gc gcVar2 : value.getGroupList()) {
                    textGenerator.print(entry.getKey().toString());
                    textGenerator.print(" {");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(gcVar2, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                }
            }
        }

        public Printer escapingNonAscii(boolean z10) {
            return new Printer(z10, this.typeRegistry);
        }

        public void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
            print(messageOrBuilder, TextFormat.multiLineOutput(appendable));
        }

        public void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printField(fieldDescriptor, obj, TextFormat.multiLineOutput(appendable));
        }

        public String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb2 = new StringBuilder();
                printField(fieldDescriptor, obj, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printFieldValue(fieldDescriptor, obj, TextFormat.multiLineOutput(appendable));
        }

        public String printToString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb2 = new StringBuilder();
                print(messageOrBuilder, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public String shortDebugString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb2 = new StringBuilder();
                print(messageOrBuilder, TextFormat.singleLineOutput(sb2));
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public Printer usingTypeRegistry(xb xbVar) {
            if (this.typeRegistry == xb.getEmptyTypeRegistry()) {
                return new Printer(this.escapeNonAscii, xbVar);
            }
            throw new IllegalArgumentException("Only one typeRegistry is allowed.");
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (!fieldDescriptor.isMapField()) {
                if (!fieldDescriptor.isRepeated()) {
                    printSingleField(fieldDescriptor, obj, textGenerator);
                    return;
                }
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    printSingleField(fieldDescriptor, it.next(), textGenerator);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                arrayList.add(new MapEntryAdapter(it2.next(), fieldDescriptor));
            }
            Collections.sort(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                printSingleField(fieldDescriptor, ((MapEntryAdapter) it3.next()).getEntry(), textGenerator);
            }
        }

        private void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textGenerator.print(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    textGenerator.print(((Long) obj).toString());
                    break;
                case 7:
                    textGenerator.print(((Boolean) obj).toString());
                    break;
                case 8:
                    textGenerator.print(((Float) obj).toString());
                    break;
                case 9:
                    textGenerator.print(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    break;
                case 12:
                case 13:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    break;
                case 14:
                    textGenerator.print("\"");
                    textGenerator.print(this.escapeNonAscii ? tc.h(new ob(ByteString.copyFromUtf8((String) obj))) : TextFormat.escapeDoubleQuotesAndBackslashes((String) obj).replace("\n", "\\n"));
                    textGenerator.print("\"");
                    break;
                case 15:
                    textGenerator.print("\"");
                    if (obj instanceof ByteString) {
                        textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    } else {
                        textGenerator.print(TextFormat.escapeBytes((byte[]) obj));
                    }
                    textGenerator.print("\"");
                    break;
                case 16:
                    textGenerator.print(((Descriptors.EnumValueDescriptor) obj).getName());
                    break;
                case 17:
                case 18:
                    print((Message) obj, textGenerator);
                    break;
            }
        }

        public void print(gc gcVar, Appendable appendable) throws IOException {
            printUnknownFields(gcVar, TextFormat.multiLineOutput(appendable));
        }

        private void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            if (messageOrBuilder.getDescriptorForType().getFullName().equals("explorestack.protobuf.Any") && printAny(messageOrBuilder, textGenerator)) {
                return;
            }
            printMessage(messageOrBuilder, textGenerator);
        }

        public String printToString(gc gcVar) {
            try {
                StringBuilder sb2 = new StringBuilder();
                print(gcVar, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb2 = new StringBuilder();
                printField(fieldDescriptor, obj, TextFormat.singleLineOutput(sb2));
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public String shortDebugString(gc gcVar) {
            try {
                StringBuilder sb2 = new StringBuilder();
                printUnknownFields(gcVar, TextFormat.singleLineOutput(sb2));
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;
        private final boolean singleLineMode;

        public /* synthetic */ TextGenerator(Appendable appendable, boolean z10, AnonymousClass1 anonymousClass1) {
            this(appendable, z10);
        }

        public void eol() throws IOException {
            if (!this.singleLineMode) {
                this.output.append("\n");
            }
            this.atStartOfLine = true;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.indent.setLength(length - 2);
        }

        public void print(CharSequence charSequence) throws IOException {
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.singleLineMode ? " " : this.indent);
            }
            this.output.append(charSequence);
        }

        private TextGenerator(Appendable appendable, boolean z10) {
            this.indent = new StringBuilder();
            this.atStartOfLine = false;
            this.output = appendable;
            this.singleLineMode = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Tokenizer {
        private int column;
        private String currentToken;
        private int line;
        private final Matcher matcher;
        private int pos;
        private int previousColumn;
        private int previousLine;
        private final CharSequence text;
        private static final Pattern WHITESPACE = Pattern.compile("(\\s|(#.*$))++", 8);
        private static final Pattern TOKEN = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8);
        private static final Pattern DOUBLE_INFINITY = Pattern.compile("-?inf(inity)?", 2);
        private static final Pattern FLOAT_INFINITY = Pattern.compile("-?inf(inity)?f?", 2);
        private static final Pattern FLOAT_NAN = Pattern.compile("nanf?", 2);

        public /* synthetic */ Tokenizer(CharSequence charSequence, AnonymousClass1 anonymousClass1) {
            this(charSequence);
        }

        private ParseException floatParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse number: " + numberFormatException.getMessage());
        }

        private ParseException integerParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse integer: " + numberFormatException.getMessage());
        }

        private void skipWhitespace() {
            this.matcher.usePattern(WHITESPACE);
            if (this.matcher.lookingAt()) {
                Matcher matcher = this.matcher;
                matcher.region(matcher.end(), this.matcher.regionEnd());
            }
        }

        public boolean atEnd() {
            return this.currentToken.length() == 0;
        }

        public void consume(String str) throws ParseException {
            if (!tryConsume(str)) {
                throw parseException(a.b.l("Expected \"", str, "\"."));
            }
        }

        public ByteString consumeByteString() throws ParseException {
            ArrayList arrayList = new ArrayList();
            consumeByteString(arrayList);
            while (true) {
                if (!this.currentToken.startsWith("'") && !this.currentToken.startsWith("\"")) {
                    return ByteString.copyFrom(arrayList);
                }
                consumeByteString(arrayList);
            }
        }

        public double consumeDouble() throws ParseException, NumberFormatException {
            if (DOUBLE_INFINITY.matcher(this.currentToken).matches()) {
                boolean zStartsWith = this.currentToken.startsWith("-");
                nextToken();
                return zStartsWith ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            if (this.currentToken.equalsIgnoreCase("nan")) {
                nextToken();
                return Double.NaN;
            }
            try {
                double d10 = Double.parseDouble(this.currentToken);
                nextToken();
                return d10;
            } catch (NumberFormatException e10) {
                throw floatParseException(e10);
            }
        }

        public float consumeFloat() throws ParseException, NumberFormatException {
            if (FLOAT_INFINITY.matcher(this.currentToken).matches()) {
                boolean zStartsWith = this.currentToken.startsWith("-");
                nextToken();
                return zStartsWith ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            if (FLOAT_NAN.matcher(this.currentToken).matches()) {
                nextToken();
                return Float.NaN;
            }
            try {
                float f10 = Float.parseFloat(this.currentToken);
                nextToken();
                return f10;
            } catch (NumberFormatException e10) {
                throw floatParseException(e10);
            }
        }

        public String consumeIdentifier() throws ParseException {
            for (int i10 = 0; i10 < this.currentToken.length(); i10++) {
                char cCharAt = this.currentToken.charAt(i10);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && !(('0' <= cCharAt && cCharAt <= '9') || cCharAt == '_' || cCharAt == '.'))) {
                    throw parseException(j1.o2.o(new StringBuilder("Expected identifier. Found '"), this.currentToken, "'"));
                }
            }
            String str = this.currentToken;
            nextToken();
            return str;
        }

        public int consumeInt32() throws ParseException {
            try {
                int int32 = TextFormat.parseInt32(this.currentToken);
                nextToken();
                return int32;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public long consumeInt64() throws ParseException {
            try {
                long int64 = TextFormat.parseInt64(this.currentToken);
                nextToken();
                return int64;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public String consumeString() throws ParseException {
            return consumeByteString().toStringUtf8();
        }

        public int consumeUInt32() throws ParseException {
            try {
                int uInt32 = TextFormat.parseUInt32(this.currentToken);
                nextToken();
                return uInt32;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public long consumeUInt64() throws ParseException {
            try {
                long uInt64 = TextFormat.parseUInt64(this.currentToken);
                nextToken();
                return uInt64;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public int getColumn() {
            return this.column;
        }

        public int getLine() {
            return this.line;
        }

        public int getPreviousColumn() {
            return this.previousColumn;
        }

        public int getPreviousLine() {
            return this.previousLine;
        }

        public boolean lookingAt(String str) {
            return this.currentToken.equals(str);
        }

        public boolean lookingAtInteger() {
            if (this.currentToken.length() == 0) {
                return false;
            }
            char cCharAt = this.currentToken.charAt(0);
            return ('0' <= cCharAt && cCharAt <= '9') || cCharAt == '-' || cCharAt == '+';
        }

        public void nextToken() {
            this.previousLine = this.line;
            this.previousColumn = this.column;
            while (this.pos < this.matcher.regionStart()) {
                if (this.text.charAt(this.pos) == '\n') {
                    this.line++;
                    this.column = 0;
                } else {
                    this.column++;
                }
                this.pos++;
            }
            if (this.matcher.regionStart() == this.matcher.regionEnd()) {
                this.currentToken = "";
                return;
            }
            this.matcher.usePattern(TOKEN);
            if (this.matcher.lookingAt()) {
                this.currentToken = this.matcher.group();
                Matcher matcher = this.matcher;
                matcher.region(matcher.end(), this.matcher.regionEnd());
            } else {
                this.currentToken = String.valueOf(this.text.charAt(this.pos));
                Matcher matcher2 = this.matcher;
                matcher2.region(this.pos + 1, matcher2.regionEnd());
            }
            skipWhitespace();
        }

        public ParseException parseException(String str) {
            return new ParseException(this.line + 1, this.column + 1, str);
        }

        public ParseException parseExceptionPreviousToken(String str) {
            return new ParseException(this.previousLine + 1, this.previousColumn + 1, str);
        }

        public boolean tryConsume(String str) {
            if (!this.currentToken.equals(str)) {
                return false;
            }
            nextToken();
            return true;
        }

        public boolean tryConsumeDouble() throws NumberFormatException {
            try {
                consumeDouble();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeFloat() throws NumberFormatException {
            try {
                consumeFloat();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeIdentifier() {
            try {
                consumeIdentifier();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeInt64() {
            try {
                consumeInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeString() {
            try {
                consumeString();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeUInt64() {
            try {
                consumeUInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public UnknownFieldParseException unknownFieldParseExceptionPreviousToken(String str, String str2) {
            return new UnknownFieldParseException(this.previousLine + 1, this.previousColumn + 1, str, str2);
        }

        private Tokenizer(CharSequence charSequence) {
            this.pos = 0;
            this.line = 0;
            this.column = 0;
            this.previousLine = 0;
            this.previousColumn = 0;
            this.text = charSequence;
            this.matcher = WHITESPACE.matcher(charSequence);
            skipWhitespace();
            nextToken();
        }

        public boolean consumeBoolean() throws ParseException {
            if (this.currentToken.equals(UupKET.MVSQksbRPbwt) || this.currentToken.equals("True") || this.currentToken.equals(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP) || this.currentToken.equals("1")) {
                nextToken();
                return true;
            }
            if (!this.currentToken.equals("false") && !this.currentToken.equals("False") && !this.currentToken.equals(InneractiveMediationDefs.GENDER_FEMALE) && !this.currentToken.equals("0")) {
                throw parseException(j1.o2.o(new StringBuilder("Expected \"true\" or \"false\". Found \""), this.currentToken, "\"."));
            }
            nextToken();
            return false;
        }

        private void consumeByteString(List<ByteString> list) throws ParseException {
            char cCharAt = this.currentToken.length() > 0 ? this.currentToken.charAt(0) : (char) 0;
            if (cCharAt != '\"' && cCharAt != '\'') {
                throw parseException("Expected string.");
            }
            if (this.currentToken.length() >= 2) {
                String str = this.currentToken;
                if (str.charAt(str.length() - 1) == cCharAt) {
                    try {
                        String str2 = this.currentToken;
                        ByteString byteStringUnescapeBytes = TextFormat.unescapeBytes(str2.substring(1, str2.length() - 1));
                        nextToken();
                        list.add(byteStringUnescapeBytes);
                        return;
                    } catch (InvalidEscapeSequenceException e10) {
                        throw parseException(e10.getMessage());
                    }
                }
            }
            throw parseException("String missing ending quote.");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class UnknownFieldParseException extends ParseException {
        private final String unknownField;

        public UnknownFieldParseException(String str) {
            this(-1, -1, "", str);
        }

        public String getUnknownField() {
            return this.unknownField;
        }

        public UnknownFieldParseException(int i10, int i11, String str, String str2) {
            super(i10, i11, str2);
            this.unknownField = str;
        }
    }

    private TextFormat() {
    }

    private static int digitValue(byte b10) {
        return (48 > b10 || b10 > 57) ? (97 > b10 || b10 > 122) ? b10 - 55 : b10 - 87 : b10 - 48;
    }

    public static String escapeBytes(ByteString byteString) {
        return tc.h(new ob(byteString));
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static Parser getParser() {
        return PARSER;
    }

    private static boolean isHex(byte b10) {
        if (48 <= b10 && b10 <= 57) {
            return true;
        }
        if (97 > b10 || b10 > 102) {
            return 65 <= b10 && b10 <= 70;
        }
        return true;
    }

    private static boolean isOctal(byte b10) {
        return 48 <= b10 && b10 <= 55;
    }

    public static void merge(Readable readable, Message.Builder builder) throws IOException {
        PARSER.merge(readable, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator multiLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, false, null);
    }

    public static <T extends Message> T parse(CharSequence charSequence, Class<T> cls) throws ParseException {
        Message.Builder builderNewBuilderForType = ((Message) x7.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, builderNewBuilderForType);
        return (T) builderNewBuilderForType.build();
    }

    public static int parseInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, true, false);
    }

    public static long parseInt64(String str) throws NumberFormatException {
        return parseInteger(str, true, true);
    }

    private static long parseInteger(String str, boolean z10, boolean z11) throws NumberFormatException {
        int i10;
        int i11 = 0;
        if (str.startsWith("-", 0)) {
            if (!z10) {
                throw new NumberFormatException("Number must be positive: ".concat(str));
            }
            i11 = 1;
        }
        int i12 = i11;
        if (str.startsWith("0x", i11)) {
            i11 += 2;
            i10 = 16;
        } else {
            i10 = str.startsWith("0", i11) ? 8 : 10;
        }
        String strSubstring = str.substring(i11);
        if (strSubstring.length() < 16) {
            long j10 = Long.parseLong(strSubstring, i10);
            if (i12 != 0) {
                j10 = -j10;
            }
            if (!z11) {
                if (z10) {
                    if (j10 > 2147483647L || j10 < -2147483648L) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
                    }
                } else if (j10 >= 4294967296L || j10 < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
                }
            }
            return j10;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i10);
        if (i12 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z11) {
            if (z10) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: ".concat(str));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: ".concat(str));
            }
        } else if (z10) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
        }
        return bigInteger.longValue();
    }

    public static int parseUInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, false, false);
    }

    public static long parseUInt64(String str) throws NumberFormatException {
        return parseInteger(str, false, true);
    }

    @Deprecated
    public static void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        printer().print(messageOrBuilder, appendable);
    }

    @Deprecated
    public static void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().printField(fieldDescriptor, obj, appendable);
    }

    @Deprecated
    public static String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return printer().printFieldToString(fieldDescriptor, obj);
    }

    @Deprecated
    public static void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().printFieldValue(fieldDescriptor, obj, appendable);
    }

    @Deprecated
    public static String printToString(MessageOrBuilder messageOrBuilder) {
        return printer().printToString(messageOrBuilder);
    }

    @Deprecated
    public static String printToUnicodeString(MessageOrBuilder messageOrBuilder) {
        return printer().escapingNonAscii(false).printToString(messageOrBuilder);
    }

    @Deprecated
    public static void printUnicode(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(messageOrBuilder, appendable);
    }

    @Deprecated
    public static void printUnicodeFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).printFieldValue(fieldDescriptor, obj, appendable);
    }

    public static void printUnknownFieldValue(int i10, Object obj, Appendable appendable) throws IOException {
        printUnknownFieldValue(i10, obj, multiLineOutput(appendable));
    }

    public static Printer printer() {
        return Printer.DEFAULT;
    }

    public static String shortDebugString(MessageOrBuilder messageOrBuilder) {
        return printer().shortDebugString(messageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator singleLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, true, null);
    }

    public static ByteString unescapeBytes(CharSequence charSequence) throws InvalidEscapeSequenceException {
        int i10;
        int i11;
        int length;
        int i12;
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        int size = byteStringCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i13 = 0;
        int i14 = 0;
        while (i13 < byteStringCopyFromUtf8.size()) {
            byte bByteAt = byteStringCopyFromUtf8.byteAt(i13);
            if (bByteAt == 92) {
                int i15 = i13 + 1;
                if (i15 >= byteStringCopyFromUtf8.size()) {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
                byte bByteAt2 = byteStringCopyFromUtf8.byteAt(i15);
                if (isOctal(bByteAt2)) {
                    int iDigitValue = digitValue(bByteAt2);
                    int i16 = i13 + 2;
                    if (i16 < byteStringCopyFromUtf8.size() && isOctal(byteStringCopyFromUtf8.byteAt(i16))) {
                        iDigitValue = (iDigitValue * 8) + digitValue(byteStringCopyFromUtf8.byteAt(i16));
                        i15 = i16;
                    }
                    i13 = i15 + 1;
                    if (i13 >= byteStringCopyFromUtf8.size() || !isOctal(byteStringCopyFromUtf8.byteAt(i13))) {
                        i13 = i15;
                    } else {
                        iDigitValue = (iDigitValue * 8) + digitValue(byteStringCopyFromUtf8.byteAt(i13));
                    }
                    i12 = i14 + 1;
                    bArr[i14] = (byte) iDigitValue;
                } else {
                    if (bByteAt2 == 34) {
                        i10 = i14 + 1;
                        bArr[i14] = 34;
                    } else if (bByteAt2 != 39) {
                        if (bByteAt2 == 85) {
                            int i17 = i13 + 2;
                            i11 = i13 + 9;
                            if (i11 >= byteStringCopyFromUtf8.size()) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int iDigitValue2 = 0;
                            int i18 = i17;
                            while (true) {
                                int i19 = i13 + 10;
                                if (i18 < i19) {
                                    byte bByteAt3 = byteStringCopyFromUtf8.byteAt(i18);
                                    if (!isHex(bByteAt3)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iDigitValue2 = (iDigitValue2 << 4) | digitValue(bByteAt3);
                                    i18++;
                                } else {
                                    if (!Character.isValidCodePoint(iDigitValue2)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i17, i19).toStringUtf8() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iDigitValue2);
                                    if (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i17, i19).toStringUtf8() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iDigitValue2}, 0, 1).getBytes(StandardCharsets.UTF_8);
                                    System.arraycopy(bytes, 0, bArr, i14, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bByteAt2 == 92) {
                            i10 = i14 + 1;
                            bArr[i14] = 92;
                        } else if (bByteAt2 == 102) {
                            i10 = i14 + 1;
                            bArr[i14] = 12;
                        } else if (bByteAt2 == 110) {
                            i10 = i14 + 1;
                            bArr[i14] = 10;
                        } else if (bByteAt2 == 114) {
                            i10 = i14 + 1;
                            bArr[i14] = 13;
                        } else if (bByteAt2 == 120) {
                            int i20 = i13 + 2;
                            if (i20 >= byteStringCopyFromUtf8.size() || !isHex(byteStringCopyFromUtf8.byteAt(i20))) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iDigitValue3 = digitValue(byteStringCopyFromUtf8.byteAt(i20));
                            i13 += 3;
                            if (i13 >= byteStringCopyFromUtf8.size() || !isHex(byteStringCopyFromUtf8.byteAt(i13))) {
                                i13 = i20;
                            } else {
                                iDigitValue3 = (iDigitValue3 * 16) + digitValue(byteStringCopyFromUtf8.byteAt(i13));
                            }
                            i12 = i14 + 1;
                            bArr[i14] = (byte) iDigitValue3;
                        } else if (bByteAt2 == 97) {
                            i10 = i14 + 1;
                            bArr[i14] = 7;
                        } else if (bByteAt2 != 98) {
                            switch (bByteAt2) {
                                case 116:
                                    i10 = i14 + 1;
                                    bArr[i14] = 9;
                                    break;
                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                    int i21 = i13 + 2;
                                    i11 = i13 + 5;
                                    if (i11 < byteStringCopyFromUtf8.size() && isHex(byteStringCopyFromUtf8.byteAt(i21))) {
                                        int i22 = i13 + 3;
                                        if (isHex(byteStringCopyFromUtf8.byteAt(i22))) {
                                            int i23 = i13 + 4;
                                            if (isHex(byteStringCopyFromUtf8.byteAt(i23)) && isHex(byteStringCopyFromUtf8.byteAt(i11))) {
                                                char cDigitValue = (char) ((digitValue(byteStringCopyFromUtf8.byteAt(i23)) << 4) | (digitValue(byteStringCopyFromUtf8.byteAt(i21)) << 12) | (digitValue(byteStringCopyFromUtf8.byteAt(i22)) << 8) | digitValue(byteStringCopyFromUtf8.byteAt(i11)));
                                                if (!Character.isSurrogate(cDigitValue)) {
                                                    byte[] bytes2 = Character.toString(cDigitValue).getBytes(StandardCharsets.UTF_8);
                                                    System.arraycopy(bytes2, 0, bArr, i14, bytes2.length);
                                                    length = bytes2.length;
                                                    break;
                                                } else {
                                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                            }
                                        }
                                    }
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    i10 = i14 + 1;
                                    bArr[i14] = 11;
                                    break;
                                default:
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) bByteAt2) + '\'');
                            }
                        } else {
                            i10 = i14 + 1;
                            bArr[i14] = 8;
                        }
                        i14 += length;
                        i13 = i11;
                    } else {
                        i10 = i14 + 1;
                        bArr[i14] = 39;
                    }
                    i14 = i10;
                    i13 = i15;
                }
                i14 = i12;
            } else {
                bArr[i14] = bByteAt;
                i14++;
            }
            i13++;
        }
        return size == i14 ? ByteString.wrap(bArr) : ByteString.copyFrom(bArr, 0, i14);
    }

    public static String unescapeText(String str) throws InvalidEscapeSequenceException {
        return unescapeBytes(str).toStringUtf8();
    }

    public static String unsignedToString(int i10) {
        return i10 >= 0 ? Integer.toString(i10) : Long.toString(i10 & 4294967295L);
    }

    public static String escapeBytes(byte[] bArr) {
        return tc.h(new pb(bArr));
    }

    public static void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, builder);
    }

    @Deprecated
    public static void print(gc gcVar, Appendable appendable) throws IOException {
        printer().print(gcVar, appendable);
    }

    @Deprecated
    public static String printToString(gc gcVar) {
        return printer().printToString(gcVar);
    }

    @Deprecated
    public static String printToUnicodeString(gc gcVar) {
        return printer().escapingNonAscii(false).printToString(gcVar);
    }

    @Deprecated
    public static void printUnicode(gc gcVar, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(gcVar, appendable);
    }

    private static void printUnknownFieldValue(int i10, Object obj, TextGenerator textGenerator) throws IOException {
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            textGenerator.print(unsignedToString(((Long) obj).longValue()));
            return;
        }
        if (tagWireType == 1) {
            textGenerator.print(String.format(null, "0x%016x", (Long) obj));
            return;
        }
        if (tagWireType != 2) {
            if (tagWireType == 3) {
                Printer.printUnknownFields((gc) obj, textGenerator);
                return;
            } else {
                if (tagWireType != 5) {
                    throw new IllegalArgumentException(a.b.e(i10, "Bad tag: "));
                }
                textGenerator.print(String.format(null, "0x%08x", (Integer) obj));
                return;
            }
        }
        try {
            gc from = gc.parseFrom((ByteString) obj);
            textGenerator.print("{");
            textGenerator.eol();
            textGenerator.indent();
            Printer.printUnknownFields(from, textGenerator);
            textGenerator.outdent();
            textGenerator.print("}");
        } catch (InvalidProtocolBufferException unused) {
            textGenerator.print("\"");
            textGenerator.print(escapeBytes((ByteString) obj));
            textGenerator.print("\"");
        }
    }

    @Deprecated
    public static String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return printer().shortDebugString(fieldDescriptor, obj);
    }

    public static void merge(Readable readable, i5 i5Var, Message.Builder builder) throws IOException {
        PARSER.merge(readable, i5Var, builder);
    }

    @Deprecated
    public static String shortDebugString(gc gcVar) {
        return printer().shortDebugString(gcVar);
    }

    public static String unsignedToString(long j10) {
        if (j10 >= 0) {
            return Long.toString(j10);
        }
        return BigInteger.valueOf(j10 & Long.MAX_VALUE).setBit(63).toString();
    }

    public static void merge(CharSequence charSequence, i5 i5Var, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, i5Var, builder);
    }

    public static <T extends Message> T parse(CharSequence charSequence, i5 i5Var, Class<T> cls) throws ParseException {
        Message.Builder builderNewBuilderForType = ((Message) x7.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, i5Var, builderNewBuilderForType);
        return (T) builderNewBuilderForType.build();
    }
}
