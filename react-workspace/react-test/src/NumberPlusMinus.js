import React, { useState } from 'react';

const NumberPlusMinus = () => {

  const [count, setCount] = useState(0);

  return (
    <>
      <button onClick={() => setCount(count - 1)} class="minus">-</button>
      {count}
      <button onClick={() => setCount(count + 1)} class="plus">+</button>
    </>
  );

}

export default NumberPlusMinus;