package ex05_enum;

public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next() {
			return SHIPPED;
		}
	}, SHIPPED {
		@Override
		OrderStatus next() {
			return DELIVERED;
		}
	}, DELIVERED {
		@Override
		OrderStatus next() throws Exception {
			throw new Exception("더 이상 상태를 전환할 수 없습니다.");
		}
	};
	
	abstract OrderStatus next() throws Exception;
}
