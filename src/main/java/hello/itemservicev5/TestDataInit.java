package hello.itemservicev5;

import hello.itemservicev5.domain.item.Item;
import hello.itemservicev5.domain.item.ItemRepository;
import hello.itemservicev5.domain.member.Member;
import hello.itemservicev5.domain.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));

        memberRepository.save(new Member("test", "test!", "테스터"));
    }

}