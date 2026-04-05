package com.iabtcf.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum SegmentType {
    DEFAULT { // from class: com.iabtcf.v2.SegmentType.1
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 0;
        }
    },
    DISCLOSED_VENDOR { // from class: com.iabtcf.v2.SegmentType.2
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 1;
        }
    },
    ALLOWED_VENDOR { // from class: com.iabtcf.v2.SegmentType.3
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 2;
        }
    },
    PUBLISHER_TC { // from class: com.iabtcf.v2.SegmentType.4
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 3;
        }
    },
    INVALID { // from class: com.iabtcf.v2.SegmentType.5
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return -1;
        }
    };

    public static SegmentType from(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? INVALID : PUBLISHER_TC : ALLOWED_VENDOR : DISCLOSED_VENDOR : DEFAULT;
    }

    public abstract int value();
}
