## 지하철 역 관련 기능
1. 지하철 목록을 반환하는 기능 
2. 지하철 역 추가 기능    
   1. 새 지하철 이름과 같은 기존 지하철 이름이 있는지 여부를 판단하는 기능
   2.  i 에서 같은 이름이 없을 때만 지하철 역 추가
3. 지하철 역 삭제 기능
    1.  역을 포함하고 있는 노선 여부를 확인하는 기능
    2. i 에서 그러한 노선이 없을때에만 역 삭제
    
## 노선 관련 기능
1. 새 노선 등록 기능
    1. 새로운 노선 이름이 두 글자 이상인지 확인
    2. 새로운 노선 이름과 같은 이름을 가진 노선이 있는지 확인
    3. i, ii 를 모두 만족할 때에만 노선 등록
2. 기존 노선 삭제 
    1. 입력받은 노선 이름과 이름이 같은 기존 노선이 있는지 여부 확인
    2. i 을 만족했을때에만 노선을 노선목록에서 삭제
3. 있는 노선 이름 목록들을 반환하는 기능

## 노선 구간 관련 기능
1. 새 구간 등록
    1. 새롭게 추가될 역이 기존에 있는 역이면 ii 로 가고 없는 역이면 iv로 간다.
    2. 추가될 노선에 기존 역이 존재하는지 확인한다. 존재하지 않으면 3 존재하면 6으로 간다.
    3.  그 역을 노선에 추가한다. 
    4. 새로운 역 객체를 만든다. 
    5. 만든 역 객체를 노선의 주어진 위치에 추가한다.
    6. 역이 추가될 위치가 맨 처음이고, 노선에 역이 존재하는 위치가 맨 끝이거나, 
    역이 추가될 위치가 맨 끝이고 노선이 역에 존재하는 위치가 맨 처음일때만 
    역을 노선에 추가하고, 나머지 경우에는 역을 노선에 추가하지 않는다. 
    
2. 기존 구간 삭제
    1. 제거될 역이 노선에 등록되어 있으면 iii 등록되지 않았으면 ii로 간다. 
    2. 지하철 노선을 그대로 둔다. 
    3. 지하철 노선에 포함된 역의 개수를 반환하는 함수의 값이 3보다 크거나 같을 때만 
    역을 노선에서 제거한다. 