package xexloaderwv;

final class CodeViewTypeInfo {

	private CodeViewTypeInfo() {
	}

	static int getPrimitiveStorageSize(long typeIndex) {
		switch ((int) typeIndex) {
			case 0x0010: // T_CHAR
			case 0x0020: // T_UCHAR
			case 0x0068: // T_INT1
			case 0x0069: // T_UINT1
			case 0x0070: // T_RCHAR
			case 0x0030: // T_BOOL08
				return 1;
			case 0x0011: // T_SHORT
			case 0x0021: // T_USHORT
			case 0x0071: // T_WCHAR
			case 0x0072: // T_INT2
			case 0x0073: // T_UINT2
			case 0x0031: // T_BOOL16
			case 0x007a: // T_CHAR16
				return 2;
			case 0x0008: // T_HRESULT
			case 0x0012: // T_LONG
			case 0x0022: // T_ULONG
			case 0x0040: // T_REAL32
			case 0x0074: // T_INT4
			case 0x0075: // T_UINT4
			case 0x0032: // T_BOOL32
			case 0x007b: // T_CHAR32
				return 4;
			case 0x0013: // T_QUAD
			case 0x0023: // T_UQUAD
			case 0x0041: // T_REAL64
			case 0x0076: // T_INT8
			case 0x0077: // T_UINT8
			case 0x0033: // T_BOOL64
				return 8;
			case 0x0014: // T_OCT
			case 0x0024: // T_UOCT
			case 0x0043: // T_REAL128
			case 0x0078: // T_INT16
			case 0x0079: // T_UINT16
				return 16;
			default:
				return -1;
		}
	}
}
